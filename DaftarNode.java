/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kompresi.huffman;

/**
 *
 * @author putri
 */

//class ini digunakan untuk mendefinisikan node.

public class DaftarNode {
    
    DaftarNode next;
    HuffmanNode data;
    public DaftarNode(HuffmanNode data) {
        this.data = data;
    }

}
