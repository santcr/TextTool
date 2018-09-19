package UI;

import Logic.TextSystem;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import javax.swing.JTextArea;

public class Window extends javax.swing.JFrame {

    private TextSystem sys = new TextSystem();
    private String previousText = "";
    private String previousText2 = "";

    public Window() {
        initComponents();

        setLocationRelativeTo(null);
        setTitle("TextTool");

        int len = textArea.getDocument().getLength();
        textArea.setCaretPosition(len);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        toUpper = new javax.swing.JButton();
        toLower = new javax.swing.JButton();
        capitalizeEveryWord = new javax.swing.JButton();
        sentenceCase = new javax.swing.JButton();
        removeBlanks = new javax.swing.JButton();
        blankToDash = new javax.swing.JButton();
        blankToUnderscore = new javax.swing.JButton();
        text1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        text2 = new javax.swing.JTextField();
        replacer = new javax.swing.JButton();
        toClipboard = new javax.swing.JButton();
        removeMultiSpace = new javax.swing.JButton();
        paste = new javax.swing.JButton();
        clearPaste = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setText("Your text here.");
        textArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(textArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 30, 350, 260);

        toUpper.setText("UPPERCASE");
        toUpper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toUpperActionPerformed(evt);
            }
        });
        getContentPane().add(toUpper);
        toUpper.setBounds(400, 30, 170, 23);

        toLower.setText("lowercase");
        toLower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toLowerActionPerformed(evt);
            }
        });
        getContentPane().add(toLower);
        toLower.setBounds(400, 70, 170, 23);

        capitalizeEveryWord.setText("Capitalize Every Word");
        capitalizeEveryWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capitalizeEveryWordActionPerformed(evt);
            }
        });
        getContentPane().add(capitalizeEveryWord);
        capitalizeEveryWord.setBounds(400, 110, 170, 23);

        sentenceCase.setText("Sentence case");
        sentenceCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sentenceCaseActionPerformed(evt);
            }
        });
        getContentPane().add(sentenceCase);
        sentenceCase.setBounds(400, 150, 170, 23);

        removeBlanks.setText("Remove blank spaces");
        removeBlanks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBlanksActionPerformed(evt);
            }
        });
        getContentPane().add(removeBlanks);
        removeBlanks.setBounds(400, 230, 170, 23);

        blankToDash.setText("Blank spaces to -");
        blankToDash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blankToDashActionPerformed(evt);
            }
        });
        getContentPane().add(blankToDash);
        blankToDash.setBounds(400, 270, 170, 23);

        blankToUnderscore.setText("Blank spaces to _");
        blankToUnderscore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blankToUnderscoreActionPerformed(evt);
            }
        });
        getContentPane().add(blankToUnderscore);
        blankToUnderscore.setBounds(400, 310, 170, 23);

        text1.setText("this text");
        text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text1ActionPerformed(evt);
            }
        });
        getContentPane().add(text1);
        text1.setBounds(80, 360, 90, 20);

        jLabel1.setText("Replace");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 360, 50, 20);

        jLabel2.setText("with");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 360, 30, 20);

        text2.setText("this other text");
        getContentPane().add(text2);
        text2.setBounds(210, 360, 90, 20);

        replacer.setText("Ok");
        replacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replacerActionPerformed(evt);
            }
        });
        getContentPane().add(replacer);
        replacer.setBounds(320, 360, 60, 23);

        toClipboard.setText("Copy to clipboard");
        toClipboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toClipboardActionPerformed(evt);
            }
        });
        getContentPane().add(toClipboard);
        toClipboard.setBounds(400, 350, 170, 40);

        removeMultiSpace.setText("Remove multiple spaces");
        removeMultiSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMultiSpaceActionPerformed(evt);
            }
        });
        getContentPane().add(removeMultiSpace);
        removeMultiSpace.setBounds(400, 190, 170, 23);

        paste.setText("Paste");
        paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteActionPerformed(evt);
            }
        });
        getContentPane().add(paste);
        paste.setBounds(150, 310, 110, 23);

        clearPaste.setText("Clear and paste");
        clearPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearPasteActionPerformed(evt);
            }
        });
        getContentPane().add(clearPaste);
        clearPaste.setBounds(270, 310, 110, 23);

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear);
        clear.setBounds(30, 310, 110, 23);

        setBounds(0, 0, 606, 448);
    }// </editor-fold>//GEN-END:initComponents

    private void toUpperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toUpperActionPerformed
        toUpper(textArea.getText());
    }//GEN-LAST:event_toUpperActionPerformed

    private void text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text1ActionPerformed

    private void toLowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toLowerActionPerformed
        toLower(textArea.getText());
    }//GEN-LAST:event_toLowerActionPerformed

    private void capitalizeEveryWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capitalizeEveryWordActionPerformed
        capitalizeEveryWord(textArea.getText());
    }//GEN-LAST:event_capitalizeEveryWordActionPerformed

    private void sentenceCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sentenceCaseActionPerformed
        toSentenceCase(textArea.getText());
    }//GEN-LAST:event_sentenceCaseActionPerformed

    private void removeBlanksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBlanksActionPerformed
        removeBlanks(textArea.getText());
    }//GEN-LAST:event_removeBlanksActionPerformed

    private void blankToDashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blankToDashActionPerformed
        blankToDash(textArea.getText());
    }//GEN-LAST:event_blankToDashActionPerformed

    private void blankToUnderscoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blankToUnderscoreActionPerformed
        blankToUnderscore(textArea.getText());
    }//GEN-LAST:event_blankToUnderscoreActionPerformed

    private void replacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replacerActionPerformed
        replaceWith(textArea.getText(), text1.getText(), text2.getText());
    }//GEN-LAST:event_replacerActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        clear();
    }//GEN-LAST:event_clearActionPerformed

    private void toClipboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toClipboardActionPerformed
        toClipboard(textArea.getText());
    }//GEN-LAST:event_toClipboardActionPerformed

    private void pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteActionPerformed
        paste();
    }//GEN-LAST:event_pasteActionPerformed

    private void clearPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearPasteActionPerformed
        clearPaste();
    }//GEN-LAST:event_clearPasteActionPerformed

    private void removeMultiSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMultiSpaceActionPerformed
        removeMultiSpace(textArea.getText());
    }//GEN-LAST:event_removeMultiSpaceActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blankToDash;
    private javax.swing.JButton blankToUnderscore;
    private javax.swing.JButton capitalizeEveryWord;
    private javax.swing.JButton clear;
    private javax.swing.JButton clearPaste;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton paste;
    private javax.swing.JButton removeBlanks;
    private javax.swing.JButton removeMultiSpace;
    private javax.swing.JButton replacer;
    private javax.swing.JButton sentenceCase;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextArea textArea;
    private javax.swing.JButton toClipboard;
    private javax.swing.JButton toLower;
    private javax.swing.JButton toUpper;
    // End of variables declaration//GEN-END:variables

    private void update(String t) {
        if (textArea.getText().equals(t)) {
            undo();
        } else {
            previousText2 = previousText;
            previousText = textArea.getText();
            textArea.setText(t);
        }
    }

    private void undo() {
        textArea.setText(previousText);
        textArea.requestFocusInWindow();
    }

    private void toUpper(String t) {
        update(sys.toUpper(t));
    }

    private void toLower(String t) {
        update(sys.toLower(t));
    }

    private void capitalizeEveryWord(String t) {
        update(sys.capitalizeEveryWord(t));
    }

    private void toSentenceCase(String t) {
        update(sys.toSentenceCase(t));
    }

    private void removeBlanks(String t) {
        update(sys.removeBlanks(t));
    }

    private void blankToDash(String t) {
        update(sys.blankToDash(t));
    }

    private void blankToUnderscore(String t) {
        update(sys.blankToUnderscore(t));
    }

    private void replaceWith(String t, String text1, String text2) {
        update(sys.replaceWith(t, text1, text2));
    }

    private void clear() {
        update("");
    }

    private void toClipboard(String t) {
        sys.toClipboard(t);
    }

    private void paste() {
        Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable t = c.getContents(this);
        String text;
        if (t == null) {
            return;
        }
        try {
            text = (textArea.getText() + (String) t.getTransferData(DataFlavor.stringFlavor));
            update(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clearPaste() {
        Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable t = c.getContents(this);
        String text;
        if (t == null) {
            return;
        }
        try {
            text = ((String) t.getTransferData(DataFlavor.stringFlavor));
            update(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void removeMultiSpace(String t) {
        String newText = sys.removeMultiSpace(t);
        if (!newText.equals(t)) {
            update(sys.removeMultiSpace(t));
        } else {
            update(t);
        }
    }

}
