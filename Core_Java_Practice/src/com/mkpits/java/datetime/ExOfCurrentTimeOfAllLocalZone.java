//Program of display all time zone
package com.mkpits.java.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class ExOfCurrentTimeOfAllLocalZone {
    public static void main(String[] args)
    {
        ZoneId.SHORT_IDS.keySet().
                stream().forEach(
                zoneKey ->System.out.println(" "+ ZoneId.of( ZoneId.SHORT_IDS.get( zoneKey ) )
                        +": "+ LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get( zoneKey ) ) ) ) );
    }
}


