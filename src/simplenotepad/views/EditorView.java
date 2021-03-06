/*
 * Copyright (C) 2015 StaticKidz
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package simplenotepad.views;

/**
 *
 * @author Adrián Barrio Andrés
 * @email statickidz@gmail.com
 * @web https://statickidz.com
 */
public class EditorView extends javax.swing.JFrame {
    
    /**
     * Creates new form EditorView
     */
    public EditorView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actionsContainer = new javax.swing.JPanel();
        newButton = new javax.swing.JButton();
        openButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        copyButton = new javax.swing.JButton();
        cutButton = new javax.swing.JButton();
        pasteButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        boldButton = new javax.swing.JButton();
        italicButton = new javax.swing.JButton();
        underlineButton = new javax.swing.JButton();
        colorButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        alignLeftButton = new javax.swing.JButton();
        alignCenterButton = new javax.swing.JButton();
        alignRightButton = new javax.swing.JButton();
        fontFamilyCombo = new javax.swing.JComboBox<>();
        fontSizeCombo = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        imageButton = new javax.swing.JButton();
        undoButton = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        helpButton = new javax.swing.JButton();
        editorContainer = new javax.swing.JScrollPane();
        textPane = new javax.swing.JTextPane();
        menuContainer = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newMenu = new javax.swing.JMenuItem();
        openMenu = new javax.swing.JMenuItem();
        saveMenu = new javax.swing.JMenuItem();
        saveAsMenu = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        printMenu = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        exitMenu = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        selectAllMenu = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        undoMenu = new javax.swing.JMenuItem();
        redoMenu = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        copyMenu = new javax.swing.JMenuItem();
        cutMenu = new javax.swing.JMenuItem();
        pasteMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SimpleNotepad");
        setMinimumSize(new java.awt.Dimension(490, 357));

        actionsContainer.setBackground(new java.awt.Color(255, 255, 255));
        actionsContainer.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 2, 2));

        newButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplenotepad/assets/icons/document-new.png"))); // NOI18N
        newButton.setToolTipText("Nuevo documento");
        newButton.setBorderPainted(false);
        newButton.setMaximumSize(new java.awt.Dimension(65, 65));
        newButton.setPreferredSize(new java.awt.Dimension(36, 36));
        actionsContainer.add(newButton);

        openButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplenotepad/assets/icons/document-open.png"))); // NOI18N
        openButton.setToolTipText("Abrir documento");
        openButton.setMaximumSize(new java.awt.Dimension(65, 65));
        openButton.setPreferredSize(new java.awt.Dimension(36, 36));
        actionsContainer.add(openButton);

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplenotepad/assets/icons/media-floppy.png"))); // NOI18N
        saveButton.setToolTipText("Guardar");
        saveButton.setMaximumSize(new java.awt.Dimension(65, 65));
        saveButton.setPreferredSize(new java.awt.Dimension(36, 36));
        actionsContainer.add(saveButton);

        printButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplenotepad/assets/icons/printer.png"))); // NOI18N
        printButton.setToolTipText("Rehacer");
        printButton.setMaximumSize(new java.awt.Dimension(12, 12));
        printButton.setMinimumSize(new java.awt.Dimension(12, 12));
        printButton.setPreferredSize(new java.awt.Dimension(36, 36));
        actionsContainer.add(printButton);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setToolTipText("");
        jSeparator3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator3.setMinimumSize(new java.awt.Dimension(10, 10));
        jSeparator3.setPreferredSize(new java.awt.Dimension(1, 30));
        actionsContainer.add(jSeparator3);

        copyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplenotepad/assets/icons/edit-copy.png"))); // NOI18N
        copyButton.setToolTipText("Copiar");
        copyButton.setMaximumSize(new java.awt.Dimension(12, 12));
        copyButton.setMinimumSize(new java.awt.Dimension(12, 12));
        copyButton.setPreferredSize(new java.awt.Dimension(36, 36));
        actionsContainer.add(copyButton);

        cutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplenotepad/assets/icons/edit-cut.png"))); // NOI18N
        cutButton.setToolTipText("Cortar");
        cutButton.setMaximumSize(new java.awt.Dimension(12, 12));
        cutButton.setMinimumSize(new java.awt.Dimension(12, 12));
        cutButton.setPreferredSize(new java.awt.Dimension(36, 36));
        actionsContainer.add(cutButton);

        pasteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplenotepad/assets/icons/edit-paste.png"))); // NOI18N
        pasteButton.setToolTipText("Pegar");
        pasteButton.setMaximumSize(new java.awt.Dimension(12, 12));
        pasteButton.setMinimumSize(new java.awt.Dimension(12, 12));
        pasteButton.setPreferredSize(new java.awt.Dimension(36, 36));
        actionsContainer.add(pasteButton);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setToolTipText("");
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator1.setMinimumSize(new java.awt.Dimension(10, 10));
        jSeparator1.setPreferredSize(new java.awt.Dimension(1, 30));
        actionsContainer.add(jSeparator1);

        boldButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplenotepad/assets/icons/format-text-bold.png"))); // NOI18N
        boldButton.setToolTipText("Negrita");
        boldButton.setMaximumSize(new java.awt.Dimension(12, 12));
        boldButton.setMinimumSize(new java.awt.Dimension(12, 12));
        boldButton.setPreferredSize(new java.awt.Dimension(36, 36));
        actionsContainer.add(boldButton);

        italicButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplenotepad/assets/icons/format-text-italic.png"))); // NOI18N
        italicButton.setToolTipText("Itálica");
        italicButton.setMaximumSize(new java.awt.Dimension(12, 12));
        italicButton.setMinimumSize(new java.awt.Dimension(12, 12));
        italicButton.setPreferredSize(new java.awt.Dimension(36, 36));
        actionsContainer.add(italicButton);

        underlineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplenotepad/assets/icons/format-text-underline.png"))); // NOI18N
        underlineButton.setToolTipText("Subrayado");
        underlineButton.setMaximumSize(new java.awt.Dimension(12, 12));
        underlineButton.setMinimumSize(new java.awt.Dimension(12, 12));
        underlineButton.setPreferredSize(new java.awt.Dimension(36, 36));
        actionsContainer.add(underlineButton);

        colorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplenotepad/assets/icons/format-text-color.png"))); // NOI18N
        colorButton.setToolTipText("Color");
        colorButton.setMaximumSize(new java.awt.Dimension(12, 12));
        colorButton.setMinimumSize(new java.awt.Dimension(12, 12));
        colorButton.setPreferredSize(new java.awt.Dimension(36, 36));
        actionsContainer.add(colorButton);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setToolTipText("");
        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator2.setMinimumSize(new java.awt.Dimension(10, 10));
        jSeparator2.setPreferredSize(new java.awt.Dimension(1, 30));
        actionsContainer.add(jSeparator2);

        alignLeftButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplenotepad/assets/icons/format-justify-left.png"))); // NOI18N
        alignLeftButton.setToolTipText("Alinear a la izquierda");
        alignLeftButton.setMaximumSize(new java.awt.Dimension(12, 12));
        alignLeftButton.setMinimumSize(new java.awt.Dimension(12, 12));
        alignLeftButton.setPreferredSize(new java.awt.Dimension(36, 36));
        actionsContainer.add(alignLeftButton);

        alignCenterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplenotepad/assets/icons/format-justify-center.png"))); // NOI18N
        alignCenterButton.setToolTipText("Centrar");
        alignCenterButton.setMaximumSize(new java.awt.Dimension(12, 12));
        alignCenterButton.setMinimumSize(new java.awt.Dimension(12, 12));
        alignCenterButton.setPreferredSize(new java.awt.Dimension(36, 36));
        actionsContainer.add(alignCenterButton);

        alignRightButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplenotepad/assets/icons/format-justify-right.png"))); // NOI18N
        alignRightButton.setToolTipText("Alinear a la derecha");
        alignRightButton.setMaximumSize(new java.awt.Dimension(12, 12));
        alignRightButton.setMinimumSize(new java.awt.Dimension(12, 12));
        alignRightButton.setPreferredSize(new java.awt.Dimension(36, 36));
        actionsContainer.add(alignRightButton);

        fontFamilyCombo.setEditable(true);
        fontFamilyCombo.setToolTipText("Tamaño de fuente");
        fontFamilyCombo.setBorder(null);
        fontFamilyCombo.setFocusable(false);
        fontFamilyCombo.setMinimumSize(new java.awt.Dimension(27, 20));
        fontFamilyCombo.setOpaque(false);
        fontFamilyCombo.setPreferredSize(new java.awt.Dimension(145, 25));
        actionsContainer.add(fontFamilyCombo);

        fontSizeCombo.setEditable(true);
        fontSizeCombo.setToolTipText("Tamaño de fuente");
        fontSizeCombo.setBorder(null);
        fontSizeCombo.setFocusable(false);
        fontSizeCombo.setMinimumSize(new java.awt.Dimension(27, 20));
        fontSizeCombo.setOpaque(false);
        fontSizeCombo.setPreferredSize(new java.awt.Dimension(53, 25));
        actionsContainer.add(fontSizeCombo);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setToolTipText("");
        jSeparator4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator4.setMinimumSize(new java.awt.Dimension(10, 10));
        jSeparator4.setPreferredSize(new java.awt.Dimension(1, 30));
        actionsContainer.add(jSeparator4);

        imageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplenotepad/assets/icons/image-x-generic.png"))); // NOI18N
        imageButton.setToolTipText("Insertar imagen");
        imageButton.setMaximumSize(new java.awt.Dimension(12, 12));
        imageButton.setMinimumSize(new java.awt.Dimension(12, 12));
        imageButton.setPreferredSize(new java.awt.Dimension(36, 36));
        actionsContainer.add(imageButton);

        undoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplenotepad/assets/icons/edit-undo.png"))); // NOI18N
        undoButton.setToolTipText("Deshacer");
        undoButton.setMaximumSize(new java.awt.Dimension(12, 12));
        undoButton.setMinimumSize(new java.awt.Dimension(12, 12));
        undoButton.setPreferredSize(new java.awt.Dimension(36, 36));
        actionsContainer.add(undoButton);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setToolTipText("");
        jSeparator5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator5.setMinimumSize(new java.awt.Dimension(10, 10));
        jSeparator5.setPreferredSize(new java.awt.Dimension(1, 30));
        actionsContainer.add(jSeparator5);

        helpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplenotepad/assets/icons/help-browser.png"))); // NOI18N
        helpButton.setToolTipText("Ayuda");
        helpButton.setMaximumSize(new java.awt.Dimension(12, 12));
        helpButton.setMinimumSize(new java.awt.Dimension(12, 12));
        helpButton.setPreferredSize(new java.awt.Dimension(36, 36));
        actionsContainer.add(helpButton);

        editorContainer.setBorder(null);

        textPane.setContentType("text/html"); // NOI18N
        textPane.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textPane.setText("<html>    <head>  \t\t    </head>    <body style='font-family:Segoe UI'>      <p style=\"margin-top: 0\">              </p>    </body>  </html>");
        textPane.setToolTipText("");
        textPane.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textPane.setMargin(new java.awt.Insets(8, 8, 8, 8));
        editorContainer.setViewportView(textPane);

        menuContainer.setBackground(new java.awt.Color(255, 255, 255));
        menuContainer.setBorder(null);
        menuContainer.setPreferredSize(new java.awt.Dimension(88, 24));

        fileMenu.setText("Archivo");
        fileMenu.setMargin(new java.awt.Insets(0, 5, 0, 5));

        newMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newMenu.setText("Nuevo");
        fileMenu.add(newMenu);

        openMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openMenu.setText("Abrir");
        fileMenu.add(openMenu);

        saveMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenu.setText("Guardar");
        fileMenu.add(saveMenu);

        saveAsMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveAsMenu.setText("Guardar como");
        fileMenu.add(saveAsMenu);
        fileMenu.add(jSeparator7);

        printMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        printMenu.setText("Imprimir");
        fileMenu.add(printMenu);
        fileMenu.add(jSeparator9);

        exitMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        exitMenu.setText("Salir");
        fileMenu.add(exitMenu);

        menuContainer.add(fileMenu);

        editMenu.setText("Editar");
        editMenu.setMargin(new java.awt.Insets(0, 5, 0, 5));

        selectAllMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        selectAllMenu.setText("Seleccionar todo");
        selectAllMenu.setToolTipText("");
        editMenu.add(selectAllMenu);
        editMenu.add(jSeparator8);

        undoMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        undoMenu.setText("Deshacer");
        editMenu.add(undoMenu);

        redoMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        redoMenu.setText("Rehacer");
        editMenu.add(redoMenu);
        editMenu.add(jSeparator6);

        copyMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copyMenu.setText("Copiar");
        editMenu.add(copyMenu);

        cutMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cutMenu.setText("Cortar");
        editMenu.add(cutMenu);

        pasteMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        pasteMenu.setText("Pegar");
        editMenu.add(pasteMenu);

        menuContainer.add(editMenu);

        setJMenuBar(menuContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editorContainer, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(actionsContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(actionsContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(editorContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel actionsContainer;
    public javax.swing.JButton alignCenterButton;
    public javax.swing.JButton alignLeftButton;
    public javax.swing.JButton alignRightButton;
    public javax.swing.JButton boldButton;
    public javax.swing.JButton colorButton;
    public javax.swing.JButton copyButton;
    public javax.swing.JMenuItem copyMenu;
    public javax.swing.JButton cutButton;
    public javax.swing.JMenuItem cutMenu;
    private javax.swing.JMenu editMenu;
    private javax.swing.JScrollPane editorContainer;
    public javax.swing.JMenuItem exitMenu;
    private javax.swing.JMenu fileMenu;
    public javax.swing.JComboBox<String> fontFamilyCombo;
    public javax.swing.JComboBox<Integer> fontSizeCombo;
    public javax.swing.JButton helpButton;
    public javax.swing.JButton imageButton;
    public javax.swing.JButton italicButton;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    public javax.swing.JMenuBar menuContainer;
    public javax.swing.JButton newButton;
    public javax.swing.JMenuItem newMenu;
    public javax.swing.JButton openButton;
    public javax.swing.JMenuItem openMenu;
    public javax.swing.JButton pasteButton;
    public javax.swing.JMenuItem pasteMenu;
    public javax.swing.JButton printButton;
    public javax.swing.JMenuItem printMenu;
    public javax.swing.JMenuItem redoMenu;
    public javax.swing.JMenuItem saveAsMenu;
    public javax.swing.JButton saveButton;
    public javax.swing.JMenuItem saveMenu;
    public javax.swing.JMenuItem selectAllMenu;
    public javax.swing.JTextPane textPane;
    public javax.swing.JButton underlineButton;
    public javax.swing.JButton undoButton;
    public javax.swing.JMenuItem undoMenu;
    // End of variables declaration//GEN-END:variables


}
