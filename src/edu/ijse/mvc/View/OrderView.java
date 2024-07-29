/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.mvc.View;

import edu.ijse.mvc.controller.CustomerController;
import edu.ijse.mvc.controller.ItemController;
import edu.ijse.mvc.controller.OrderController;
import edu.ijse.mvc.dto.CustomerDto;
import edu.ijse.mvc.dto.CustomerDto;
import edu.ijse.mvc.dto.ItemDto;
import edu.ijse.mvc.dto.OrderDetailDto;
import edu.ijse.mvc.dto.OrderDto;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Heshan
 */
public class OrderView extends javax.swing.JFrame {

    /**
     * Creates new form OrderView
     */
      private ItemController itemController;
       private CustomerController customerController;
        private ArrayList<OrderDetailDto> orderDetailDtos;
         private OrderController orderController;
    
    public OrderView() throws Exception {
        itemController = new ItemController();
         customerController = new CustomerController();
          orderController = new OrderController();
         orderDetailDtos = new ArrayList<>();
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblOrderId = new javax.swing.JLabel();
        txtOrderId = new javax.swing.JTextField();
        lblCustId = new javax.swing.JLabel();
        txtCustId = new javax.swing.JTextField();
        btnSearchCustomer = new javax.swing.JButton();
        lblItemData = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblItemId = new javax.swing.JLabel();
        txtItemId = new javax.swing.JTextField();
        btnSearchItem = new javax.swing.JButton();
        lblCustDetail = new javax.swing.JLabel();
        lblDiscount = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        lblQty = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        btnAddToTable = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderDetail = new javax.swing.JTable();
        btnPlaceOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Place Order");

        lblOrderId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblOrderId.setText("Order Id");

        lblCustId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCustId.setText("Customer Id");

        btnSearchCustomer.setText("Search");
        btnSearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCustomerActionPerformed(evt);
            }
        });

        lblItemId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblItemId.setText("Item Id");

        btnSearchItem.setText("Search");
        btnSearchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchItemActionPerformed(evt);
            }
        });

        lblDiscount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDiscount.setText("Discount");

        lblQty.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQty.setText("Qty");

        btnAddToTable.setText("Add");
        btnAddToTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToTableActionPerformed(evt);
            }
        });

        tblOrderDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblOrderDetail);

        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblItemId, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtItemId, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQty, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnAddToTable))
                    .addComponent(lblItemData, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(187, 187, 187))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtOrderId, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(txtCustId))
                        .addGap(38, 38, 38)
                        .addComponent(btnSearchCustomer)
                        .addGap(49, 49, 49)
                        .addComponent(lblCustDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnPlaceOrder)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOrderId))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(lblCustId, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(txtCustId)
                        .addComponent(btnSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCustDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblItemId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtItemId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDiscount)
                            .addComponent(lblQty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtQty)
                            .addComponent(btnAddToTable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblItemData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchItemActionPerformed
        // TODO add your handling code here:
        searchItem();
    }//GEN-LAST:event_btnSearchItemActionPerformed

    private void btnSearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCustomerActionPerformed
        // TODO add your handling code here:
        //seacrhCustomer();
    }//GEN-LAST:event_btnSearchCustomerActionPerformed

    private void btnAddToTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToTableActionPerformed
        // TODO add your handling code here:
        addToTable();
    }//GEN-LAST:event_btnAddToTableActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
          placeOrder();
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new OrderView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToTable;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnSearchCustomer;
    private javax.swing.JButton btnSearchItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCustDetail;
    private javax.swing.JLabel lblCustId;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblItemData;
    private javax.swing.JLabel lblItemId;
    private javax.swing.JLabel lblOrderId;
    private javax.swing.JLabel lblQty;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblOrderDetail;
    private javax.swing.JTextField txtCustId;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtItemId;
    private javax.swing.JTextField txtOrderId;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables

      private void searchItem(){
        try {
            String itemId = txtItemId.getText();
            ItemDto itemDto = itemController.searchItem(itemId);
            if(itemDto != null){
                lblItemData.setText(itemDto.getCode() + " | " + itemDto.getDescription() + " : " + itemDto.getQoh() + " : " + itemDto.getUnitPrice() );
            } else {
                lblItemData.setText("Item not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error at Search Item");
        }
    }
    
//     private void seacrhCustomer(){
//        try {
//           String custId = txtCustId.getText();
//            CustomerDto customerDto = customerController.searchCustomer(custId);
//            if(customerDto  != null){
//                lblCustDetail.setText(customerDto.getCustId() + " | " + customerDto.getName() );
//            } else {
//                lblItemData.setText("Customer not found");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(this, "Error at Search Customer");
//        }
//    }
    
      
      
      
      
      
      
      
      
       private void loadTable() {
        String columns[] = {"Item Code", "Qty", "Discount"};
        DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
     tblOrderDetail.setModel(dtm);
    
}

        private void addToTable() {
         OrderDetailDto orderDetailDto = new OrderDetailDto(null, txtItemId.getText(),
                Integer.parseInt(txtQty.getText()),
                Integer.parseInt(txtDiscount.getText()));
        orderDetailDtos.add(orderDetailDto);

        Object[] rowData = {orderDetailDto.getItemCode(), orderDetailDto.getQty(), orderDetailDto.getDiscount()}; 
        DefaultTableModel dtm = (DefaultTableModel) tblOrderDetail.getModel();
        dtm.addRow(rowData);
        cleanItem();
    }

    private void cleanItem(){
        txtItemId.setText("");
        txtDiscount.setText("");
        txtQty.setText("");
        lblItemData.setText("");

    }
        

    
     private void placeOrder(){
        try {
            OrderDto orderDto = new OrderDto();
            orderDto.setOrderId(txtOrderId.getText());
            orderDto.setCustId(txtCustId.getText());

            // 2014-06-15 -> yyyy-MM-dd
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(new Date());
            orderDto.setDate(date);

            String resp = orderController.placeOrder(orderDto, orderDetailDtos);
            JOptionPane.showMessageDialog(this, resp);
        } catch(Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error at Order Save");
        }
    }

    
            
}




