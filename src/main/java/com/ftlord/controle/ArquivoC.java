/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftlord.controle;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author LordFabricio
 */
public class ArquivoC {

    private InputStream inStream;
    private OutputStream outStream;
    private String caminho;
    private String arquivo;
    private String somaCA;
    private final String install;

    /**
     * Contrutor Vazio porem usado para Iniciar as Variáveis.
     */
    public ArquivoC() {
        this.caminho = null;
        this.arquivo = null;
        this.somaCA = null;
        this.install = System.getProperty("user.dir"); //Comando usado para Buscar o Diretório Raiz da aplicação.
    }

    /**
     * Metodo Salvar Imagem.
     * Recebe um Parametro do tipo String.
     * Retorna Uma ImagemIcon.
     * @param file
     * @return 
     */
    public ImageIcon salvarImagem(String file) {
        ImageIcon imagem = new ImageIcon();
        try {
            JFileChooser jc = new JFileChooser();
            FileFilter ff = new FileNameExtensionFilter("Image Files", ImageIO.getReaderFileSuffixes());
            jc.setFileFilter(ff);
            int ok = jc.showOpenDialog(null);
            if (ok == JFileChooser.APPROVE_OPTION) {
                caminho = jc.getCurrentDirectory().getPath();
                arquivo = jc.getSelectedFile().getName();
                somaCA = caminho + "\\" + arquivo;
                File copia = new File(somaCA);
                File cola = new File(install + "\\src\\main\\resources\\img\\" + file + ".png");
                inStream = new FileInputStream(copia);
                outStream = new FileOutputStream(cola);
                byte[] buffer = new byte[1024];
                int length;
                while ((length = inStream.read(buffer)) > 0) {
                    outStream.write(buffer, 0, length);
                }
                inStream.close();
                outStream.close();
                imagem = new ImageIcon(install + "\\src\\main\\resources\\img\\" + file + ".png");
                Image tamanho = imagem.getImage();
                Image novoT = tamanho.getScaledInstance(150, 120, java.awt.Image.SCALE_SMOOTH);
                imagem = new ImageIcon(novoT);
                JOptionPane.showMessageDialog(null, "Imagem Adicionada!!!");
            } else {
                jc.cancelSelection();
            }
        } catch (Exception e) {

        }
        return imagem;
    }

    /**
     * Metodo usado para Procurar na pasta resources\img\ o Arquivo.png
     * Recebe um Parametro tipo String.
     * Retorna uma ImageIcon
     * @param file
     * @return 
     */
    public ImageIcon pegaImagem(String file) {
        ImageIcon imagem = new ImageIcon();
        imagem = new ImageIcon(install + "\\src\\main\\resources\\img\\" + file + ".png");
        Image tamanho = imagem.getImage();
        Image novoT = tamanho.getScaledInstance(150, 120, java.awt.Image.SCALE_SMOOTH);
        imagem = new ImageIcon(novoT);
        return imagem;
    }
    
    //As Variaveis não possuem Getters e Setters pois não é nescessario alterar-los de fora da classe. 

}
