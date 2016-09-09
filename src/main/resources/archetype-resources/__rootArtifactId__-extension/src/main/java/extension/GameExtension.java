#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 
 */
package ${package}.extension;

import com.tvd12.ezyfox.core.annotation.RoomContextConfiguration;
import com.tvd12.ezyfox.sfs2x.extension.RoomExtension;

/**
 * @author tavandung12
 *
 */
@RoomContextConfiguration(clazz = RoomConfig.class)
public class GameExtension extends RoomExtension {
}
