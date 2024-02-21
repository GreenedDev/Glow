This is my second plugin!

Commands:

/glow - If you are already glowing it will disable glow effect. If you're not, it will enable glow effect.
/reloadglow - Reload the configuration

Permissions:

- glow.command
- glow.reload

Placeholders:

%glow_isenabled% - returns if player is glowing or not. Which player? depends on where you use this placeholder. You can modify what this placeholder returns in the config

Configuration:
```
#Hello this is Glow plugin created by Greened. use /reloadglow to reload the plugin. The permission needed is glow.reload

#The message that is sent when console executes the glow command
only-players: "&cOnly players can to that!"

#Permission denied message. the glow permission is glow.command
permission-message: "&cYou don't have permission to execute this command!"

#The message sent when disabling glow
glow-enable: "&aYou enabled your &bGlowing &aeffect!"

#The message sent when enabling glow
glow-disable: "&cYou disabled your &bGlowing &ceffect!"

#The reload message use /reloadglow to reload the plugin.
reload-config: "&aSuccessfully reloaded!"

#THIS IS PLACEHOLDERAPI SECTION

#Available placeholders:
#%glow_isenabled% - returns if player has glowing enabled or not. which player? depends on where you use this placeholder


#return value for placeholder %glow_isenabled% if glow effect is enabled
glowing-isenabled-yes: "&aEnabled"

#text replacing placeholder when glowing is disabled for that player
glowing-isenabled-no: "&cDisabled"
#text replacing placeholder when glowing is enabled for that player
glowing-isenabled-offline: "&4Player is offline"
glowing-wrong-placeholder: "&4You probably used wrong placeholder. Please see placeholders list on the plugin page."
 ```

Messages:

![image](https://github.com/GreenedDev/Glow/assets/108997309/308cc998-5c66-4a0a-8df8-659a880b4b3d)

What plugin does:

![image](https://github.com/GreenedDev/Glow/assets/108997309/0c7b58f9-2cd1-484d-b72a-3730b62639f7)


If you have any issues using this plugin please report it at our discord: https://discord.gg/s96G9dNyr2
