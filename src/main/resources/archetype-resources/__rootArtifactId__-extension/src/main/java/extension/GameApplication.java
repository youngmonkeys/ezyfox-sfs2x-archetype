#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 
 */
package ${package}.extension;

import com.tvd12.ezyfox.core.annotation.AppContextConfiguration;
import com.tvd12.ezyfox.sfs2x.extension.ZoneExtension;

/**
 * @author tavandung12
 *
 */
@AppContextConfiguration(clazz = AppConfig.class)
public class GameApplication extends ZoneExtension {
}
