package me.hufman.androidautoidrive

import java.util.*

enum class ChassisCode(val brand: String, val chassis: String) {
    // Mini codes | https://new.minimania.com/MINI_model_designations
    R50("MINI", "Cooper"),
    R53("MINI", "Cooper"),
    R56("MINI", "Cooper"),
    F55("MINI", "Cooper"),
    F56("MINI", "Cooper"),
    R52("MINI", "Convertible"),
    R57("MINI", "Convertible"),
    F57("MINI", "Convertible"),
    R55("MINI", "Clubman"),
    F54("MINI", "Clubman"),
    R58("MINI", "Coupe"),
    R59("MINI", "Roadster"),
    R61("MINI", "Paceman"),
    R60("MINI", "Countryman"),
    F60("MINI", "Countryman"),

    // BMW codes | https://burgertuning.com/pages/chassis-codes
    G07("BMW","X7"),
    E26("BMW","M1"),
    E25("BMW","Concept"),
    F48("BMW","X1"),
    F39("BMW","X2"),
    F47("BMW","X2"),
    F26("BMW","X4"),
    F16("BMW","X6"),
    F86("BMW","X6"),
    F85("BMW","X5"),
    G02("BMW","X4"),
    G01("BMW","X3"),
    I01("BMW","i3"),
    I12("BMW","i8"),
    F25("BMW","X3"),
    F15("BMW","X5"),
    E36_7("BMW","Z3"),
    E36_8("BMW","Z3"),
    E89("BMW","Z4"),
    E86("BMW","Z4"),
    E85("BMW","Z4"),
    E84("BMW","X1"),
    E83("BMW","X3"),
    E72("BMW","X6"),
    E71("BMW","X6"),
    E70("BMW","X5"),
    E53("BMW","X5"),
    E52("BMW","Z8"),
    G20("BMW","3 Series"),
    G12("BMW","7 Series"),
    G11("BMW","7 Series"),
    G38("BMW","5 Series"),
    G31("BMW","5 Series"),
    G30("BMW","5 Series"),
    F90("BMW","5 Series"),      // M5
    F91("BMW","8 Series"),      // M8
    F92("BMW","8 Series"),      // M8
    F93("BMW","8 Series"),      // M8
    F96("BMW","X6M"),      // X6M
    F97("BMW","X3M"),      // X3M
    F98("BMW","X4M"),      // X4M
    F87("BMW","2 Series"),      // 2 competition
    F83("BMW","4 Series"),
    F82("BMW","4 Series"),
    F36("BMW","4 Series"),
    F33("BMW","4 Series"),
    F32("BMW","4 Series"),
    F80("BMW","3 Series"),
    F35("BMW","3 Series"),
    F34("BMW","3 Series"),
    F31("BMW","3 Series"),
    F30("BMW","3 Series"),
    F22("BMW","2 Series"),
    F23("BMW","2 Series"),
    F46("BMW","2 Series"),
    F45("BMW","2 Series"),
    F44("BMW","2 Series"),
    F21("BMW","1 Series"),
    F20("BMW","1 Series"),
    F18("BMW","5 Series"),
    F13("BMW","6 Series"),
    F12("BMW","6 Series"),
    F11("BMW","5 Series"),
    F10("BMW","5 Series"),
    F07("BMW","5 Series"),
    F06("BMW","6 Series"),
    F04("BMW","7 Series"),
    F03("BMW","7 Series"),
    F02("BMW","7 Series"),
    F01("BMW","7 Series"),
    E93("BMW","3 Series"),
    E92("BMW","3 Series"),
    E91("BMW","3 Series"),
    E90("BMW","3 Series"),
    E88("BMW","1 Series"),
    E87("BMW","1 Series"),
    E82E("BMW","1 Series"),
    E82("BMW","1 Series"),
    E81("BMW","1 Series"),
    E68("BMW","7 Series"),
    E67("BMW","7 Series"),
    E66("BMW","7 Series"),
    E65("BMW","7 Series"),
    E64("BMW","6 Series"),
    E63("BMW","6 Series"),
    E61("BMW","5 Series"),
    E60("BMW","5 Series"),
    E46("BMW","3 Series"),
    E39("BMW","5 Series"),
    E38("BMW","7 Series"),
    E36("BMW","3 Series"),
    E36_5("BMW","3 Series"),
    E34("BMW","5 Series"),
    E32("BMW","7 Series"),
    E31("BMW","8 Series"),
    E30("BMW","3 Series"),
    E28("BMW","5 Series"),
    E24("BMW","6 Series"),
    E23("BMW","7 Series"),
    E21("BMW","3 Series"),
    E12("BMW","5 Series"),
    E9("BMW","2 Series"),
    E6("BMW","2 Series"),
    E3("BMW","2 Series");

    companion object {
        fun fromCode(chassisCode: String): ChassisCode? {
            val code = chassisCode.uppercase(Locale.ROOT).replace(Regex("[^A-Z0-9]"), "_")
            return values().firstOrNull {
                it.name == code
            }
        }
    }

    override fun toString(): String {
        return "$brand $chassis"
    }
}
