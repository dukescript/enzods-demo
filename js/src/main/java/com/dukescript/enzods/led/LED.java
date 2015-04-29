/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dukescript.enzods.led;

import net.java.html.js.JavaScriptBody;
import net.java.html.js.JavaScriptResource;

@JavaScriptResource(value = "led-min.js")
public class LED {

    @JavaScriptBody(args = {}, body = "ko.components.register('led', {\n"
            + "    viewModel: function(params){\n"
            + "        this.on = params.on;\n"
            + "        this.id = params.id;\n"
            + "        var led = new Led({id: 'control',\n"
            + "                         parentId      : this.id(),\n"
            + "                         width         : 100,\n"
            + "                         height        : 100,\n"
            + "                         isScalable    : false,\n"
            + "                         isFrameVisible: true,\n"
            + "                         isOn          : this.on(),\n"
            + "                         color         : \"#ff0000\"\n"
            + "         });"
            + "         this.on.subscribe(function(newValue) {\n"
            + "              led.setOn(newValue);\n"
            + "         });"
            + "     },\n"
            + "     template:\n"
            + "          '<!-- -->'\n"
            + "});")
    public static native void registerLED();

}
