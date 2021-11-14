package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import BLL.khambenhBLL;
import Check.Tester;
import DTO.bacsi;
import DTO.khambenh;

public class khamBenhGUI extends JFrame {
	List<khambenh> khamBenhList = new ArrayList<khambenh>();
	khambenhBLL kbBLL = new khambenhBLL();

	private JPanel contentPane;
	private JTextField tfngaykham;
	private JTextField tfTrieutrung;
	private JTextField tfFind;
	private JTable table;
	DefaultTableModel model = new DefaultTableModel();
	private JComboBox cbBenhnhan;
	List<String> benhnhanList = kbBLL.getbenhnhanList();
	private JTextField tfsophongkham;
	private JTextField tfsophieukham;
	private JComboBox cbBacsi;
	List<String> bacsiList = kbBLL.getbacsiList();
	private JComboBox cbMaBenh;
	List<String> maBenhList = kbBLL.getMabenh();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					khamBenhGUI frame = new khamBenhGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public khamBenhGUI() {
		setTitle("Khám bệnh");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(120, 100, 1234, 695);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 47, 1220, 47);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DANH SÁCH PHIẾU KHÁM");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(406, 8, 374, 32);
		panel.add(lblNewLabel);
		
		tfFind = new JTextField();
		tfFind.setBounds(813, 10, 221, 30);
		panel.add(tfFind);
		tfFind.setColumns(10);
		
		JButton btnSearch = new JButton("Tìm kiếm");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnSearch_actionPerformed(e);
			}
		});

		btnSearch.setBounds(1033, 10, 85, 31);
		panel.add(btnSearch);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		panel_1.setBounds(0, 95, 493, 568);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Số phiểu khám");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(26, 34, 108, 42);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ngày khám");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(26, 86, 108, 42);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Triệu chứng");
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(26, 138, 97, 42);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Tên bác sĩ");
		lblNewLabel_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2_1.setBounds(26, 190, 97, 42);
		panel_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Tên bệnh nhân");
		lblNewLabel_1_2_2.setForeground(Color.BLACK);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2_2.setBounds(26, 242, 97, 42);
		panel_1.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Tên bệnh");
		lblNewLabel_1_2_3.setForeground(Color.BLACK);
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2_3.setBounds(26, 303, 97, 42);
		panel_1.add(lblNewLabel_1_2_3);

		
		tfngaykham = new JTextField();
		tfngaykham.setColumns(10);
		tfngaykham.setBounds(157, 86, 299, 32);
		panel_1.add(tfngaykham);
		
		tfTrieutrung = new JTextField();
		tfTrieutrung.setColumns(10);
		tfTrieutrung.setBounds(157, 138, 299, 32);
		panel_1.add(tfTrieutrung);
		
		cbBenhnhan = new JComboBox(benhnhanList.toArray());
		cbBenhnhan.setBounds(157, 248, 299, 33);
		panel_1.add(cbBenhnhan);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnReset_actionPerformed(e);
			}
		});
		btnReset.setBounds(26, 464, 85, 42);
		panel_1.add(btnReset);
		
		JButton btnRemove = new JButton("Xóa");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnRemove_actionPerformed(e);
			}
		});
		btnRemove.setBounds(140, 464, 85, 42);
		panel_1.add(btnRemove);
		
		JButton btnEdit = new JButton("Sửa ");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnEdit_actionPerformed(e);
			}
		});
		btnEdit.setBounds(254, 464, 85, 42);
		panel_1.add(btnEdit);
		
		JButton btnAdd = new JButton("Thêm");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnAdd_actionPerformed(e);
			}
		});
		btnAdd.setBounds(371, 464, 85, 42);
		panel_1.add(btnAdd);
		
		cbBacsi = new JComboBox(bacsiList.toArray());
		cbBacsi.setBounds(157, 190, 299, 33);
		panel_1.add(cbBacsi);
		
		cbMaBenh = new JComboBox(maBenhList.toArray());
		cbMaBenh.setBounds(157, 309, 299, 33);
		panel_1.add(cbMaBenh);
		
		JLabel lblNewLabel_1_2_3_1 = new JLabel("Chi phí khám ");
		lblNewLabel_1_2_3_1.setForeground(Color.BLACK);
		lblNewLabel_1_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2_3_1.setBounds(26, 370, 97, 42);
		panel_1.add(lblNewLabel_1_2_3_1);
		
		tfsophongkham = new JTextField();
		tfsophongkham.setColumns(10);
		tfsophongkham.setBounds(157, 370, 299, 32);
		panel_1.add(tfsophongkham);
		
		tfsophieukham = new JTextField();
		tfsophieukham.setEditable(false);
		tfsophieukham.setColumns(10);
		tfsophieukham.setBounds(157, 34, 299, 32);
		panel_1.add(tfsophieukham);
		tfsophieukham.setText(String.valueOf(kbBLL.getSPKMAX()));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(492, 95, 728, 568);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				do_table_mouseClicked(e);
			}
		});
		scrollPane.setViewportView(table);
		
		table.setModel(model);
		
		JButton btnGoBack = new JButton("Trở lại");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnGoBack.setBounds(0, 0, 106, 48);
		contentPane.add(btnGoBack);
		model.addColumn("STT");
		model.addColumn("Số phiếu khám");
		model.addColumn("Ngày khám");
		model.addColumn("Triệu trứng");
		model.addColumn("Mã bác sĩ");
		model.addColumn("Mã bệnh nhân");
		model.addColumn("Mã bệnh");
		model.addColumn("Chi phí khám");
		displayList();
	}
	protected void do_btnAdd_actionPerformed(ActionEvent e) {
		if(!tfsophieukham.getText().trim().equals("") && !tfngaykham.getText().trim().equals("") && !tfTrieutrung.getText().trim().equals("") && !tfsophongkham.getText().trim().equals("")) {
			try {
				int sophieukham=  Integer.parseInt(tfsophieukham.getText());
				String ngaykham = tfngaykham.getText();
				String tenBenh = String.valueOf(cbMaBenh.getSelectedItem().toString());
				int mabenh = kbBLL.getData("benh", "MA_BENH", tenBenh, "TEN_BENH");
				Tester t = new Tester();
				if(!t.day(ngaykham)) {
					JOptionPane.showMessageDialog(null, "Ngày khám không hợp lệ");
					return ;
				}
				
				String tenBn = String.valueOf(cbBenhnhan.getSelectedItem().toString());
				int mabn = kbBLL.getData("benh_nhan", "MABN", tenBn, "TENBN");
				
				String tenBs = String.valueOf(cbBacsi.getSelectedItem().toString());
				int mabs = kbBLL.getData("bac_si", "MABS", tenBs, "TENBS");
				
				String trieutrung = tfTrieutrung.getText();
				int sophongkham =Integer.parseInt(tfsophongkham.getText());
				khambenh kb=new khambenh(sophieukham,ngaykham,trieutrung,mabs,mabn,mabenh,sophongkham);				
				JOptionPane.showMessageDialog(null,kbBLL.addkhambenh(kb));
				displayList();
				do_btnReset_actionPerformed(e);
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, "Bạn đã nhập sai dữ liệu. Vui lòng thử lại");
			} 
		}
		else {
			JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin của phiếu khám");
		}
	}
	protected void do_btnReset_actionPerformed(ActionEvent e) {
		tfsophieukham.setText("");
		tfngaykham.setText("");
		tfTrieutrung.setText("");
		cbBacsi.setSelectedIndex(0);
		cbBenhnhan.setSelectedIndex(0);
		cbMaBenh.setSelectedIndex(0);
		tfsophieukham.setText(String.valueOf(kbBLL.getSPKMAX()));
		tfsophongkham.setText("");
		displayList();
	}
	
	protected void do_btnEdit_actionPerformed(ActionEvent e) {
		try {
			int index = table.getSelectedRow();
			if(index>=0 && !tfsophieukham.getText().trim().equals("") && !tfngaykham.getText().trim().equals("") && !tfTrieutrung.getText().trim().equals("") && !tfsophongkham.getText().trim().equals("")) {
				khambenh p = new khambenh();
				
				p.setSophieukham(Integer.parseInt(tfsophieukham.getText()));
				p.setNgaykham(tfngaykham.getText());
				p.setTrieutrung(tfTrieutrung.getText());
				
				String tenBenh = String.valueOf(cbMaBenh.getSelectedItem().toString());
				int mabenh = kbBLL.getData("benh", "MA_BENH", tenBenh, "TEN_BENH");
				p.setMabenh(mabenh);
				
				String tenBenhNhan = String.valueOf(cbBenhnhan.getSelectedItem().toString());
				int mabn = kbBLL.getData("benh_nhan", "MABN", tenBenhNhan, "TENBN");
				p.setMabn(mabn);
				
				String tenBs = String.valueOf(cbBacsi.getSelectedItem().toString());
				int mabs = kbBLL.getData("bac_si", "MABS", tenBs, "TENBS");
				p.setMabs(mabs);
	
				p.setSophongkham(Integer.parseInt(tfsophongkham.getText()));
				
				JOptionPane.showMessageDialog(null, kbBLL.editkhambenh(p));
				displayList();
				do_btnReset_actionPerformed(e);
			}
			else {
				JOptionPane.showMessageDialog(null, "Vui lòng chọn phiếu khám để sửa");
			}
			
		}catch(InputMismatchException ex) {
			JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin của phiếu khám");
		}
	}
	protected void do_btnRemove_actionPerformed(ActionEvent e) {
		int selectedIndex = table.getSelectedRow();
        if(selectedIndex >= 0 && !tfsophieukham.getText().equals("")) {
        	int sophieu =  Integer.parseInt(tfsophieukham.getText());
//            Product p = productList.get(selectedIndex);
            
            int option = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa phiếu khám này không?", "Question", JOptionPane.YES_NO_OPTION);
            
            if(option == JOptionPane.YES_OPTION) {
            	int sure = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa phiếu khám này không?", "Question", JOptionPane.YES_NO_OPTION);
            	if(sure == JOptionPane.YES_OPTION) {
            		JOptionPane.showMessageDialog(null,kbBLL.deletekhambenh(sophieu));
	                displayList();
	                do_btnReset_actionPerformed(e);
            	}
            }
        }
        else {
        	JOptionPane.showMessageDialog(null, "Vui lòng chọn phiếu khám để xóa");
        }
	}
	protected void do_btnSearch_actionPerformed(ActionEvent e) {
		int maBenhNhan = Integer.parseInt(tfFind.getText());
        if(maBenhNhan >= 0) {
            khamBenhList = kbBLL.searchkhambenhs(maBenhNhan);
            
            if(khamBenhList.size()==0) {
            	JOptionPane.showMessageDialog(null, "Không có phiếu khám bệnh bạn cần tìm");
            	displayList();
            }
            
            else {
	            model.setRowCount(0);
	            int i = 0;
	    		while(i < khamBenhList.size()) {
	    			khambenh p = khamBenhList.get(i);
	    			model.addRow(new Object [] {
	    					model.getRowCount()+1, p.getSophieukham(), p.getNgaykham(), p.getTrieutrung(), p.getMabs(),p.getMabn(), p.getMabenh(),p.getSophongkham()
	    			});
	    			i++;
	    		}
            }
            
        } else {
        	JOptionPane.showMessageDialog(null, "Vui lòng nhập số phiếu khám để tìm kiếm");
        }
	}
	protected void do_btnGoBack_actionPerformed(ActionEvent e) {
		if(loginGUI.permission.equals("Giám đốc")) {
			adminGUI p = new adminGUI();
			p.setVisible(true);
		}
		else if(loginGUI.permission.equals("Quản trị hệ thống")) {
			quantriGUI p = new quantriGUI();
			p.setVisible(true);
		}
		else if(loginGUI.permission.equals("Bác sĩ")) {
			doctorGUI p = new doctorGUI();
			p.setVisible(true);
		}
		else {
			employeeGUI p = new employeeGUI();
			p.setVisible(true);;
		}
		this.setVisible(false);
	}
	private void displayList() {
		model.setRowCount(0);
		khamBenhList = kbBLL.getAllkhambenh();
    	int i = 0;
		while(i < khamBenhList.size()) {
			khambenh p = khamBenhList.get(i);
			model.addRow(new Object [] {
					model.getRowCount()+1, p.getSophieukham(), p.getNgaykham(), p.getTrieutrung(), p.getMabs(),p.getMabn(), p.getMabenh(),p.getSophongkham()
			});
			i++;
		}
		
	}
	protected void do_table_mouseClicked(MouseEvent e) {
		int selectedIndex = table.getSelectedRow();
        if(selectedIndex >= 0) {            
            tfsophieukham.setText(String.valueOf(model.getValueAt(selectedIndex, 1)));
    		tfngaykham.setText(String.valueOf(model.getValueAt(selectedIndex, 2)));
    		tfTrieutrung.setText(String.valueOf(model.getValueAt(selectedIndex, 3)));
    		
    		String maBs = model.getValueAt(selectedIndex, 4).toString();
    		String tenBs = kbBLL.getData1("bac_si", "TENBS", maBs, "MABS");
    		cbBacsi.setSelectedItem(tenBs.toString());
    		
    		String maBn = model.getValueAt(selectedIndex, 5).toString();
    		String tenBn = kbBLL.getData1("benh_nhan", "TENBN", maBn, "MABN");
    		cbBenhnhan.setSelectedItem(tenBn.toString());
    		
    		String maBenh = model.getValueAt(selectedIndex, 6).toString();
    		String tenBenh = kbBLL.getData1("benh", "TEN_BENH", maBenh, "MA_BENH");
    		cbMaBenh.setSelectedItem(String.valueOf(tenBenh));
    		
    		tfsophongkham.setText(String.valueOf(model.getValueAt(selectedIndex, 7)));
        }
	}
}