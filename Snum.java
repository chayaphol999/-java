
public class Snum extends javax.swing.JPanel {

    public Snum() {
        initComponents();
    }
 String value;

    public void getvalue1(String val) {
        if (val.equals("-")) {
            value = "";
        } else {
            value = val;
        }
        innum.setText(value);
        addnum();
        System.out.print(value);
    }

    public void addnum() {
        value = innum.getText();
        if (value.equals("")) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/num/8T.jpg")));
        } else {
            switch (value) {
                case "0":
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/num/0.jpg")));
                    break;
                case "1":
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/num/1.jpg")));
                    break;
                case "2":
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/num/2.jpg")));
                    break;
                case "3":
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/num/3.jpg")));
                    break;
                case "4":
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/num/4.jpg")));
                    break;
                case "5":
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/num/5.jpg")));
                    break;
                case "6":
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/num/6.jpg")));
                    break;
                case "7":
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/num/7.jpg")));
                    break;
                case "8":
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/num/8.jpg")));
                    break;
                case "9":
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/num/9.jpg")));
                
            }

        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        innum = new javax.swing.JTextField();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/num/8T.jpg"))); // NOI18N

        innum.setText("0");
        innum.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                innumCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(innum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(innum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void innumCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_innumCaretUpdate
        addnum();
    }//GEN-LAST:event_innumCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField innum;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
