package com.mycompany.filnalexam_20182866_nguyenvantuan.view;

import com.mycompany.filnalexam_20182866_nguyenvantuan.controller.Implement.HoDanDAO;
import com.mycompany.filnalexam_20182866_nguyenvantuan.controller.Implement.KhuPhoDAO;
import com.mycompany.filnalexam_20182866_nguyenvantuan.controller.Implement.NguoiDAO;
import com.mycompany.filnalexam_20182866_nguyenvantuan.model.HoDanModel;
import com.mycompany.filnalexam_20182866_nguyenvantuan.model.KhuPhoModel;
import com.mycompany.filnalexam_20182866_nguyenvantuan.model.NguoiModel;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Nguyen Van Tuan
 */
public class XoaKhuPhoFrame extends javax.swing.JFrame {
    int indexHoDan = 0;
    int indexNguoi = 0;
    /**
     * Creates new form XoaKhuPhoFrame
     */
    public XoaKhuPhoFrame() {
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

        xaoKhuPhoLabel = new javax.swing.JLabel();
        maKhuPhoLabel = new javax.swing.JLabel();
        maKhuPhoTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        tenKhuPhoLabel = new javax.swing.JLabel();
        tenKhuPhoTextField = new javax.swing.JTextField();
        xoaKhuPhoButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        maHoDanLabel = new javax.swing.JLabel();
        maHoDanTextField = new javax.swing.JTextField();
        soNhaLabel = new javax.swing.JLabel();
        soNhaTextField = new javax.swing.JTextField();
        hoDanTruocButton = new javax.swing.JButton();
        hoDanSauButton = new javax.swing.JButton();
        xoaHoDanButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        maNguoiLabel = new javax.swing.JLabel();
        maNguoiTextField = new javax.swing.JTextField();
        hoTenLabel = new javax.swing.JLabel();
        hoTenTextField = new javax.swing.JTextField();
        tuoiLabel = new javax.swing.JLabel();
        tuoiTextField = new javax.swing.JTextField();
        namSinhLabel = new javax.swing.JLabel();
        namSinhTextField = new javax.swing.JTextField();
        ngheNghiepLabel = new javax.swing.JLabel();
        ngheNghiepTextField = new javax.swing.JTextField();
        thanhVienTruocButton = new javax.swing.JButton();
        thanhVienSauButton = new javax.swing.JButton();
        xoaNguoiButton = new javax.swing.JButton();
        timKiemNguoiButton = new javax.swing.JButton();
        timKiemHoDanButton = new javax.swing.JButton();
        timKiemKhuPhoButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        xaoKhuPhoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        xaoKhuPhoLabel.setText("X??a khu ph???");

        maKhuPhoLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        maKhuPhoLabel.setText("Nh???p m?? khu ph???");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        tenKhuPhoLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tenKhuPhoLabel.setText("T??n khu ph???");

        tenKhuPhoTextField.setEnabled(false);

        xoaKhuPhoButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        xoaKhuPhoButton.setText("X??a khu ph???");
        xoaKhuPhoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaKhuPhoButtonActionPerformed(evt);
            }
        });

        maHoDanLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        maHoDanLabel.setText("M?? h??? d??n");

        soNhaLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        soNhaLabel.setText("S??? nh??");

        soNhaTextField.setEnabled(false);

        hoDanTruocButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hoDanTruocButton.setText("H??? d??n tr?????c");
        hoDanTruocButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoDanTruocButtonActionPerformed(evt);
            }
        });

        hoDanSauButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hoDanSauButton.setText("H??? d??n sau");
        hoDanSauButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoDanSauButtonActionPerformed(evt);
            }
        });

        xoaHoDanButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        xoaHoDanButton.setText("X??a h??? d??n");
        xoaHoDanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaHoDanButtonActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        maNguoiLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        maNguoiLabel.setText("M?? ng?????i");

        hoTenLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hoTenLabel.setText("H??? t??n");

        hoTenTextField.setEnabled(false);

        tuoiLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tuoiLabel.setText("Tu???i");

        tuoiTextField.setEnabled(false);

        namSinhLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        namSinhLabel.setText("N??m sinh");

        namSinhTextField.setEnabled(false);

        ngheNghiepLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ngheNghiepLabel.setText("Ngh??? nghi???p");

        ngheNghiepTextField.setEnabled(false);

        thanhVienTruocButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        thanhVienTruocButton.setText("Th??nh vi??n tr?????c");
        thanhVienTruocButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thanhVienTruocButtonActionPerformed(evt);
            }
        });

        thanhVienSauButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        thanhVienSauButton.setText("Th??nh vi??n sau");
        thanhVienSauButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thanhVienSauButtonActionPerformed(evt);
            }
        });

        xoaNguoiButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        xoaNguoiButton.setText("X??a ng?????i d??n");
        xoaNguoiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaNguoiButtonActionPerformed(evt);
            }
        });

        timKiemNguoiButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        timKiemNguoiButton.setText("T??m ki???m");
        timKiemNguoiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timKiemNguoiButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(namSinhLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(maNguoiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hoTenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tuoiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ngheNghiepLabel))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(thanhVienTruocButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(thanhVienSauButton))
                    .addComponent(maNguoiTextField)
                    .addComponent(hoTenTextField)
                    .addComponent(tuoiTextField)
                    .addComponent(namSinhTextField)
                    .addComponent(ngheNghiepTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timKiemNguoiButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(xoaNguoiButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maNguoiLabel)
                    .addComponent(maNguoiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timKiemNguoiButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hoTenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hoTenLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tuoiLabel)
                    .addComponent(tuoiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namSinhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namSinhLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ngheNghiepLabel)
                    .addComponent(ngheNghiepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thanhVienTruocButton)
                    .addComponent(thanhVienSauButton)
                    .addComponent(xoaNguoiButton))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        timKiemHoDanButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        timKiemHoDanButton.setText("T??m ki???m");
        timKiemHoDanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timKiemHoDanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maHoDanLabel)
                    .addComponent(soNhaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(soNhaTextField)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(hoDanTruocButton)
                        .addGap(78, 78, 78)
                        .addComponent(hoDanSauButton))
                    .addComponent(maHoDanTextField))
                .addGap(131, 131, 131)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(xoaHoDanButton)
                    .addComponent(timKiemHoDanButton))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maHoDanLabel)
                    .addComponent(maHoDanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timKiemHoDanButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soNhaLabel)
                    .addComponent(soNhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoDanTruocButton)
                    .addComponent(hoDanSauButton)
                    .addComponent(xoaHoDanButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(tenKhuPhoLabel)
                .addGap(47, 47, 47)
                .addComponent(tenKhuPhoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(xoaKhuPhoButton)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tenKhuPhoLabel)
                    .addComponent(tenKhuPhoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xoaKhuPhoButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        timKiemKhuPhoButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        timKiemKhuPhoButton.setText("T??m ki???m");
        timKiemKhuPhoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timKiemKhuPhoButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(maKhuPhoLabel)
                        .addGap(18, 18, 18)
                        .addComponent(maKhuPhoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(timKiemKhuPhoButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(xaoKhuPhoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190)
                        .addComponent(backButton)))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xaoKhuPhoLabel)
                    .addComponent(backButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maKhuPhoLabel)
                    .addComponent(maKhuPhoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timKiemKhuPhoButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        KhuPhoFrame frame = new KhuPhoFrame();
        frame.show();
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void timKiemKhuPhoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timKiemKhuPhoButtonActionPerformed
        String maKhuPho = maKhuPhoTextField.getText();
        if("".equals(maKhuPho)) {
            JOptionPane.showMessageDialog(rootPane, "B???n c???n nh???p m?? khu ph???");
        } else {
            KhuPhoDAO kpDAO = new KhuPhoDAO();
            KhuPhoModel khuPho = kpDAO.findByID(maKhuPho);          
            if(khuPho != null) {
               tenKhuPhoTextField.setText(khuPho.getTenKhuPho());
               
               HoDanDAO hdDAO = new HoDanDAO();
               List<HoDanModel> listHoDan = hdDAO.findByMaKhuPho(maKhuPho);
               maHoDanTextField.setText(listHoDan.get(0).getMaHoDan());
               soNhaTextField.setText(listHoDan.get(0).getSoNha());
               
               NguoiDAO nguoiDAO = new NguoiDAO();
               List<NguoiModel> listNguoi = nguoiDAO.findByMaHoDan(maHoDanTextField.getText());
               maNguoiTextField.setText(listNguoi.get(0).getMaNguoi());
               hoTenTextField.setText(listNguoi.get(0).getHoVaTen());
               tuoiTextField.setText(Integer.toString(listNguoi.get(0).getTuoi()));
               namSinhTextField.setText(Integer.toString(listNguoi.get(0).getNamSinh()));
               ngheNghiepTextField.setText(listNguoi.get(0).getNgheNghiep());    
            } else {
               JOptionPane.showMessageDialog(rootPane, "M?? khu ph??? kh??ng t???n t???i");
            }
            
        }
    }//GEN-LAST:event_timKiemKhuPhoButtonActionPerformed

    private void hoDanSauButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoDanSauButtonActionPerformed
        if(!"".equals(maKhuPhoTextField.getText())) {
            HoDanDAO hdDAO = new HoDanDAO();
            List<HoDanModel> listHoDan = hdDAO.findByMaKhuPho(maKhuPhoTextField.getText());

            indexHoDan++;
            int soLuongHoDan = listHoDan.size();
            if(indexHoDan > soLuongHoDan - 1) {
                indexHoDan = 0;
            }

            maHoDanTextField.setText(listHoDan.get(indexHoDan).getMaHoDan());
            soNhaTextField.setText(listHoDan.get(indexHoDan).getSoNha());

            NguoiDAO nguoiDAO = new NguoiDAO();
            List<NguoiModel> listNguoi = nguoiDAO.findByMaHoDan(maHoDanTextField.getText());
            maNguoiTextField.setText(listNguoi.get(0).getMaNguoi());
            hoTenTextField.setText(listNguoi.get(0).getHoVaTen());
            tuoiTextField.setText(Integer.toString(listNguoi.get(0).getTuoi()));
            namSinhTextField.setText(Integer.toString(listNguoi.get(0).getNamSinh()));
            ngheNghiepTextField.setText(listNguoi.get(0).getNgheNghiep());
        }        
    }//GEN-LAST:event_hoDanSauButtonActionPerformed

    private void hoDanTruocButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoDanTruocButtonActionPerformed
        if(!"".equals(maKhuPhoTextField.getText())) {
            HoDanDAO hdDAO = new HoDanDAO();
            List<HoDanModel> listHoDan = hdDAO.findByMaKhuPho(maKhuPhoTextField.getText());

            indexHoDan--;
            int soLuongHoDan = listHoDan.size();
            if(indexHoDan < 0) {
                indexHoDan = soLuongHoDan - 1;
            }

            maHoDanTextField.setText(listHoDan.get(indexHoDan).getMaHoDan());
            soNhaTextField.setText(listHoDan.get(indexHoDan).getSoNha());

            NguoiDAO nguoiDAO = new NguoiDAO();
            List<NguoiModel> listNguoi = nguoiDAO.findByMaHoDan(maHoDanTextField.getText());
            maNguoiTextField.setText(listNguoi.get(0).getMaNguoi());
            hoTenTextField.setText(listNguoi.get(0).getHoVaTen());
            tuoiTextField.setText(Integer.toString(listNguoi.get(0).getTuoi()));
            namSinhTextField.setText(Integer.toString(listNguoi.get(0).getNamSinh()));
            ngheNghiepTextField.setText(listNguoi.get(0).getNgheNghiep());
        }       
    }//GEN-LAST:event_hoDanTruocButtonActionPerformed

    private void thanhVienSauButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thanhVienSauButtonActionPerformed
        if(!"".equals(maHoDanTextField.getText())) {
            NguoiDAO nguoiDAO = new NguoiDAO();
            List<NguoiModel> listNguoi = nguoiDAO.findByMaHoDan(maHoDanTextField.getText());
            indexNguoi++;
            int soLuongThanhVien = listNguoi.size();
            if(indexNguoi > soLuongThanhVien - 1) {
                indexNguoi = 0;
            }
            maNguoiTextField.setText(listNguoi.get(indexNguoi).getMaNguoi());
            hoTenTextField.setText(listNguoi.get(indexNguoi).getHoVaTen());
            tuoiTextField.setText(Integer.toString(listNguoi.get(indexNguoi).getTuoi()));
            namSinhTextField.setText(Integer.toString(listNguoi.get(indexNguoi).getNamSinh()));
            ngheNghiepTextField.setText(listNguoi.get(indexNguoi).getNgheNghiep());
        }
    }//GEN-LAST:event_thanhVienSauButtonActionPerformed

    private void thanhVienTruocButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thanhVienTruocButtonActionPerformed
        if(!"".equals(maHoDanTextField.getText())) {
            NguoiDAO nguoiDAO = new NguoiDAO();
            List<NguoiModel> listNguoi = nguoiDAO.findByMaHoDan(maHoDanTextField.getText());
            indexNguoi--;
            int soLuongThanhVien = listNguoi.size();
            if(indexNguoi < 0) {
                indexNguoi = soLuongThanhVien - 1;
            }
            maNguoiTextField.setText(listNguoi.get(indexNguoi).getMaNguoi());
            hoTenTextField.setText(listNguoi.get(indexNguoi).getHoVaTen());
            tuoiTextField.setText(Integer.toString(listNguoi.get(indexNguoi).getTuoi()));
            namSinhTextField.setText(Integer.toString(listNguoi.get(indexNguoi).getNamSinh()));
            ngheNghiepTextField.setText(listNguoi.get(indexNguoi).getNgheNghiep());
        }
        
    }//GEN-LAST:event_thanhVienTruocButtonActionPerformed

    private void xoaNguoiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaNguoiButtonActionPerformed
        String maNguoi = maNguoiTextField.getText();
        NguoiDAO nguoiDAO = new NguoiDAO();
        int input = JOptionPane.showConfirmDialog(rootPane, "B???n c?? ch???c ch???n mu???n x??a ng?????i d??n n??y?");
        if(input == 0) {
            if(nguoiDAO.deleteNguoiByID(maNguoi)) {
                JOptionPane.showMessageDialog(rootPane, "X??a ng?????i d??n th??nh c??ng");        
            } else {
                JOptionPane.showMessageDialog(rootPane, "X??a kh??ng th??nh c??ng, ki???m tra l???i m?? ng?????i d??n");
            }
        }
    }//GEN-LAST:event_xoaNguoiButtonActionPerformed

    private void timKiemNguoiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timKiemNguoiButtonActionPerformed
        String maNguoi = maNguoiTextField.getText();
        NguoiDAO nguoiDAO = new NguoiDAO();
        NguoiModel nguoi = nguoiDAO.findByID(maNguoi);
        if(nguoi != null) {
            maNguoiTextField.setText(nguoi.getMaNguoi());
            hoTenTextField.setText(nguoi.getHoVaTen());
            tuoiTextField.setText(Integer.toString(nguoi.getTuoi()));
            namSinhTextField.setText(Integer.toString(nguoi.getNamSinh()));
            ngheNghiepTextField.setText(nguoi.getNgheNghiep());
            
            HoDanDAO hdDAO = new HoDanDAO();
            HoDanModel hoDan = hdDAO.findByID(nguoi.getMaHoDan());
            maHoDanTextField.setText(hoDan.getMaHoDan());
            soNhaTextField.setText(hoDan.getSoNha());
            
            KhuPhoDAO kpDAO = new KhuPhoDAO();
            KhuPhoModel khuPho = kpDAO.findByID(hoDan.getMaKhuPho());
            maKhuPhoTextField.setText(khuPho.getMaKhuPho());
            tenKhuPhoTextField.setText(khuPho.getTenKhuPho());
        } else {
            JOptionPane.showMessageDialog(rootPane, "M?? ng?????i kh??ng t???n t???i");
        }
    }//GEN-LAST:event_timKiemNguoiButtonActionPerformed

    private void timKiemHoDanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timKiemHoDanButtonActionPerformed
        String maHoDan = maHoDanTextField.getText();
        HoDanDAO hdDAO = new HoDanDAO();
        HoDanModel hoDan = hdDAO.findByID(maHoDan);
        if(hoDan != null) {
            maHoDanTextField.setText(hoDan.getMaHoDan());
            soNhaTextField.setText(hoDan.getSoNha());
            
            KhuPhoDAO kpDAO = new KhuPhoDAO();
            KhuPhoModel khuPho = kpDAO.findByID(hoDan.getMaKhuPho());
            maKhuPhoTextField.setText(khuPho.getMaKhuPho());
            tenKhuPhoTextField.setText(khuPho.getTenKhuPho());
            
            NguoiDAO nguoiDAO = new NguoiDAO();
            List<NguoiModel> listNguoi = nguoiDAO.findByMaHoDan(maHoDanTextField.getText());
            maNguoiTextField.setText(listNguoi.get(0).getMaNguoi());
            hoTenTextField.setText(listNguoi.get(0).getHoVaTen());
            tuoiTextField.setText(Integer.toString(listNguoi.get(0).getTuoi()));
            namSinhTextField.setText(Integer.toString(listNguoi.get(0).getNamSinh()));
            ngheNghiepTextField.setText(listNguoi.get(0).getNgheNghiep());            
        } else {
            JOptionPane.showMessageDialog(rootPane, "M?? h??? d??n kh??ng t???n t???i");
        }
    }//GEN-LAST:event_timKiemHoDanButtonActionPerformed
       
    private void xoaHoDanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaHoDanButtonActionPerformed
        String maHoDan = maHoDanTextField.getText();
        HoDanDAO hdDAO = new HoDanDAO();
        int input = JOptionPane.showConfirmDialog(rootPane, "B???n s??? x??a h??? d??n n??y v?? t???t c??? th??nh vi??n trong ????, b???n c?? ch???c ch???n kh??ng?");
        if(input == 0) {
            if(hdDAO.deleteHoDanByID(maHoDan)) {
                hdDAO.deleteNguoiByMaHoDan(maHoDan);
                JOptionPane.showMessageDialog(rootPane, "X??a h??? d??n th??nh c??ng");        
            } else {
                JOptionPane.showMessageDialog(rootPane, "X??a kh??ng th??nh c??ng, ki???m tra l???i m?? h??? d??n");
            }
        }
    }//GEN-LAST:event_xoaHoDanButtonActionPerformed

    private void xoaKhuPhoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaKhuPhoButtonActionPerformed
        String maKhuPho = maKhuPhoTextField.getText();
        KhuPhoDAO kpDAO = new KhuPhoDAO();
        int input = JOptionPane.showConfirmDialog(rootPane, "B???n s??? x??a khu ph??? n??y v?? t???t c??? h??? d??n v?? th??nh vi??n trong ????, b???n c?? ch???c ch???n kh??ng?");
        if(input == 0) {
            if(kpDAO.deleteKhuPhoByID(maKhuPho)) {
                HoDanDAO hdDAO = new HoDanDAO();
                List<HoDanModel> listHoDan = hdDAO.findByMaKhuPho(maKhuPho);
                
                kpDAO.deleteHoDanByMaKhuPho(maKhuPho);
                for(int i = 0; i < listHoDan.size(); i++) {
                    hdDAO.deleteNguoiByMaHoDan(listHoDan.get(i).getMaHoDan());
                }
                JOptionPane.showMessageDialog(rootPane, "X??a khu ph??? th??nh c??ng");        
            } else {
                JOptionPane.showMessageDialog(rootPane, "X??a kh??ng th??nh c??ng, ki???m tra l???i m?? khu ph???");
            }
        }
    }//GEN-LAST:event_xoaKhuPhoButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(XoaKhuPhoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XoaKhuPhoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XoaKhuPhoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XoaKhuPhoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XoaKhuPhoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton hoDanSauButton;
    private javax.swing.JButton hoDanTruocButton;
    private javax.swing.JLabel hoTenLabel;
    private javax.swing.JTextField hoTenTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel maHoDanLabel;
    private javax.swing.JTextField maHoDanTextField;
    private javax.swing.JLabel maKhuPhoLabel;
    private javax.swing.JTextField maKhuPhoTextField;
    private javax.swing.JLabel maNguoiLabel;
    private javax.swing.JTextField maNguoiTextField;
    private javax.swing.JLabel namSinhLabel;
    private javax.swing.JTextField namSinhTextField;
    private javax.swing.JLabel ngheNghiepLabel;
    private javax.swing.JTextField ngheNghiepTextField;
    private javax.swing.JLabel soNhaLabel;
    private javax.swing.JTextField soNhaTextField;
    private javax.swing.JLabel tenKhuPhoLabel;
    private javax.swing.JTextField tenKhuPhoTextField;
    private javax.swing.JButton thanhVienSauButton;
    private javax.swing.JButton thanhVienTruocButton;
    private javax.swing.JButton timKiemHoDanButton;
    private javax.swing.JButton timKiemKhuPhoButton;
    private javax.swing.JButton timKiemNguoiButton;
    private javax.swing.JLabel tuoiLabel;
    private javax.swing.JTextField tuoiTextField;
    private javax.swing.JLabel xaoKhuPhoLabel;
    private javax.swing.JButton xoaHoDanButton;
    private javax.swing.JButton xoaKhuPhoButton;
    private javax.swing.JButton xoaNguoiButton;
    // End of variables declaration//GEN-END:variables
}
