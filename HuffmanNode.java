/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kompresi.huffman;

/**
 *
 * @author putri
 */

//class ini digunakan untuk mendefinisikan node tree huffman

public class HuffmanNode {
   HuffmanNode leftchild, rightchild;
   int freq, data;

    public HuffmanNode() {
    }
   
    public HuffmanNode(int data, int freq) {
        this.data = data;
        this.freq = freq;
    }
}
