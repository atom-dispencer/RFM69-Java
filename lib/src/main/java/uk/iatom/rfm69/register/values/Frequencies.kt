package uk.iatom.rfm69.register.values

import uk.iatom.rfm69.register.IRegisterValue

enum class Frequencies(`val`: Int): IRegisterValue { // RegFrf (MHz) - carrier frequency
    // 315Mhz band
    PAMSB_314(0x4E),
    PAMID_314(0x80),
    PALSB_314(0x00),
    PAMSB_315(0x4E),
    PAMID_315(0xC0),
    PALSB_315(0x00),
    PAMSB_316(0x4F),
    PAMID_316(0x00),
    PALSB_316(0x00),


    // 433mhz band),
    PAMSB_433(0x6C),
    PAMID_433(0x40),
    PALSB_433(0x00),
    PAMSB_434(0x6C),
    PAMID_434(0x80),
    PALSB_434(0x00),
    PAMSB_435(0x6C),
    PAMID_435(0xC0),
    PALSB_435(0x00),


    // 868Mhz band),
    PAMSB_863(0xD7),
    PAMID_863(0xC0),
    PALSB_863(0x00),
    PAMSB_864(0xD8),
    PAMID_864(0x00),
    PALSB_864(0x00),
    PAMSB_865(0xD8),
    PAMID_865(0x40),
    PALSB_865(0x00),
    PAMSB_866(0xD8),
    PAMID_866(0x80),
    PALSB_866(0x00),
    PAMSB_867(0xD8),
    PAMID_867(0xC0),
    PALSB_867(0x00),
    PAMSB_868(0xD9),
    PAMID_868(0x00),
    PALSB_868(0x00),
    PAMSB_869(0xD9),
    PAMID_869(0x40),
    PALSB_869(0x00),
    PAMSB_870(0xD9),
    PAMID_870(0x80),
    PALSB_870(0x00),


    // 915Mhz band
    PAMSB_902(0xE1),
    PAMID_902(0x80),
    PALSB_902(0x00),
    PAMSB_903(0xE1),
    PAMID_903(0xC0),
    PALSB_903(0x00),
    PAMSB_904(0xE2),
    PAMID_904(0x00),
    PALSB_904(0x00),
    PAMSB_905(0xE2),
    PAMID_905(0x40),
    PALSB_905(0x00),
    PAMSB_906(0xE2),
    PAMID_906(0x80),
    PALSB_906(0x00),
    PAMSB_907(0xE2),
    PAMID_907(0xC0),
    PALSB_907(0x00),
    PAMSB_908(0xE3),
    PAMID_908(0x00),
    PALSB_908(0x00),
    PAMSB_909(0xE3),
    PAMID_909(0x40),
    PALSB_909(0x00),
    PAMSB_910(0xE3),
    PAMID_910(0x80),
    PALSB_910(0x00),
    PAMSB_911(0xE3),
    PAMID_911(0xC0),
    PALSB_911(0x00),
    PAMSB_912(0xE4),
    PAMID_912(0x00),
    PALSB_912(0x00),
    PAMSB_913(0xE4),
    PAMID_913(0x40),
    PALSB_913(0x00),
    PAMSB_914(0xE4),
    PAMID_914(0x80),
    PALSB_914(0x00),
    PAMSB_915(0xE4),


    // Default
    PAMID_915(0xC0),


    // Default
    PALSB_915(0x00),


    // Default
    PAMSB_916(0xE5),
    PAMID_916(0x00),
    PALSB_916(0x00),
    PAMSB_917(0xE5),
    PAMID_917(0x40),
    PALSB_917(0x00),
    PAMSB_918(0xE5),
    PAMID_918(0x80),
    PALSB_918(0x00),
    PAMSB_919(0xE5),
    PAMID_919(0xC0),
    PALSB_919(0x00),
    PAMSB_920(0xE6),
    PAMID_920(0x00),
    PALSB_920(0x00),
    PAMSB_921(0xE6),
    PAMID_921(0x40),
    PALSB_921(0x00),
    PAMSB_922(0xE6),
    PAMID_922(0x80),
    PALSB_922(0x00),
    PAMSB_923(0xE6),
    PAMID_923(0xC0),
    PALSB_923(0x00),
    PAMSB_924(0xE7),
    PAMID_924(0x00),
    PALSB_924(0x00),
    PAMSB_925(0xE7),
    PAMID_925(0x40),
    PALSB_925(0x00),
    PAMSB_926(0xE7),
    PAMID_926(0x80),
    PALSB_926(0x00),
    PAMSB_927(0xE7),
    PAMID_927(0xC0),
    PALSB_927(0x00),
    PAMSB_928(0xE8),
    PAMID_928(0x00),
    PALSB_928(0x00);

    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun `val`(): Byte {
        return `val`
    }
}
