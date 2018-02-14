/*
 * Esta es la clase que dibuja un Pentagono
 */
package codigo;

import java.awt.Color;


/**
 *
 * @author xp
 */
public class Pentagono extends Forma {

     public Pentagono(int _posX, int _posY, Color _color, boolean _relleno) {
        //inicializo el constructor del pentágono correctamente para que guarde cinco lados
        super(_posX, _posY, 5, _color, _relleno);
    }
}
