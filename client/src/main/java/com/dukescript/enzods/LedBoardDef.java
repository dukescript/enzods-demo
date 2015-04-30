package com.dukescript.enzods;

import net.java.html.json.Function;
import net.java.html.json.Model;
import net.java.html.json.Property;

@Model(
        className = "LedBoard", properties = {
            @Property(name = "leds", type = LEDViewModel.class, array = true)
        }
        ,targetId = ""
)
public class LedBoardDef {

    @Model(className = "LEDViewModel", properties = {
        @Property(name = "on", type = boolean.class),
        @Property(name = "id", type = String.class),
        @Property(name = "parentId", type = String.class)            
    })
    public static class LedViewModelDef {

        @Function
        public static void turnOn(LEDViewModel model) {
            model.setOn(true);
        }

        @Function
        public static void turnOff(LEDViewModel model) {
            model.setOn(false);
        }
    }
}
