package me.hufman.androidautoidrive.carapp.calendar

import android.util.Log
import io.bimmergestalt.idriveconnectkit.android.CarAppAssetResources
import me.hufman.androidautoidrive.AppSettings
import me.hufman.androidautoidrive.MainService
import me.hufman.androidautoidrive.MutableAppSettingsReceiver
import me.hufman.androidautoidrive.calendar.CalendarProvider
import me.hufman.androidautoidrive.carapp.CarAppService
import me.hufman.androidautoidrive.carapp.navigation.AndroidGeocoderSearcher

class CalendarAppService: CarAppService() {

	val appSettings by lazy { MutableAppSettingsReceiver(applicationContext) }
	var carappCalendar: CalendarApp? = null

	override fun shouldStartApp(): Boolean {
		return appSettings[AppSettings.KEYS.ENABLED_CALENDAR].toBoolean()
	}

	override fun onCarStart() {
		Log.i(MainService.TAG, "Starting calendar app")
		val handler = handler!!
		carappCalendar = CalendarApp(iDriveConnectionStatus, securityAccess,
				CarAppAssetResources(applicationContext, "calendar"),
				CalendarProvider(applicationContext, appSettings),
				AndroidGeocoderSearcher(applicationContext))
		carappCalendar?.onCreate()
	}

	override fun onCarStop() {
		carappCalendar?.disconnect()
		carappCalendar = null
	}
}