/**
 * @author Ninja_5tyl3
 *
 */
/**
 * License
 * This work is licensed under the Creative Commons Attribution-NonCommercial 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc/3.0/.
 */
package ninja5tyl3.openstructures;

import java.util.logging.Logger;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

import ninja5tyl3.core.Core;
import ninja5tyl3.core.NinjaConfiguration;

@Mod(modid="Extra Structures Mod", name="Extra Structures Mod", version="0.0.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class OpenStructures
{
	public static final String ID = "OpenStructures";
	public static final String Version = "0.0.0";
	
	public static boolean testStructure;
	
	EventManager eventmanager = new EventManager();
	
	@Instance(ID)
	public static OpenStructures instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//logger = Logger.getLogger(ID);
		//logger.setParent(FMLLog.getLogger());
		
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());

        config.load();

        // Since this flag is a boolean, we can read it into the variable directly from the config.
        Property someProperty = config.get(NinjaConfiguration.CATEGORY_STRUCTURE, "Test Structure", true);
        
        someProperty.comment = "You can choose what structures are generated here.";
       
        boolean someBoolean = someProperty.getBoolean(true);
        // this could also be:
        // int someInt = someProperty.getInt();
        // boolean someBoolean = someProperty.getBoolean(true);

        config.save();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(eventmanager);
		
	}
	
	
}