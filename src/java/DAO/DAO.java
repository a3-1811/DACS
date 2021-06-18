package DAO;

import Entities.BillDetail;
import Entities.BillStatus;
import Entities.Cart;
import Entities.CartView;
import Entities.Categories;
import Entities.Product;
import Entities.User;
import context.DbContext;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class DAO {

    Connection connect = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
//Lay dan hsach tat ca san pham hien co

    public List<Product> getAllProduct() {
        String query = "SELECT * FROM PRODUCT";
        List<Product> list = new LinkedList<Product>();
        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                Product temp = new Product();
                temp.setId(rs.getByte(1));
                temp.setName(rs.getNString(2));
                temp.setImage(rs.getNString(3));
                temp.setPrice(rs.getInt(6));
                temp.setDescriptions(rs.getNString(4));
                temp.setCategoryId(rs.getInt(5));
                list.add(temp);
            }

        } catch (Exception e) {
        }

        return list;
    }
//Lay danh sach tat ca categories

    public List<Categories> getAllCategories() {
        String query = "SELECT * FROM Categories";
        List<Categories> list = new LinkedList<Categories>();
        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                Categories temp = new Categories();
                temp.setId(rs.getByte(1));
                temp.setName(rs.getNString(2).toUpperCase());
                list.add(temp);
            }
        } catch (Exception e) {
        }
        return list;
    }
//lay danh sach san pham theo id categories

    public List<Product> getProductByCate(String id) {
        String query = "SELECT * FROM Product\n"
                + "WHERE categoryId = ?";
        List<Product> list = new LinkedList<Product>();
        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                Product temp = new Product();
                temp.setId(rs.getByte(1));
                temp.setName(rs.getNString(2));
                temp.setImage(rs.getNString(3));
                temp.setPrice(rs.getInt(6));
                temp.setDescriptions(rs.getNString(4));
                temp.setCategoryId(rs.getInt(5));
                list.add(temp);
            }
        } catch (Exception e) {
        }
        return list;
    }
//lay san pham theo id

    public Product getProductById(String id) {
        String query = "SELECT * FROM Product\n"
                + "WHERE id = ?";
        Product temp = new Product();
        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                temp.setId(rs.getByte(1));
                temp.setName(rs.getNString(2));
                temp.setImage(rs.getNString(3));
                temp.setPrice(rs.getInt(6));
                temp.setDescriptions(rs.getNString(4));
                temp.setCategoryId(rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return temp;
    }

    // lay danh sach theo keyword
    public List<Product> searchProducts(String txt) {
        String query = "SELECT * FROM Product\n"
                + "WHERE name like ? or descriptions like ?";
        List<Product> list = new LinkedList<Product>();

        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            ps.setString(2, "%" + txt + "%");
            rs = ps.executeQuery();

            while (rs.next()) {
                Product temp = new Product();
                temp.setId(rs.getByte(1));
                temp.setName(rs.getNString(2));
                temp.setImage(rs.getNString(3));
                temp.setPrice(rs.getInt(6));
                temp.setDescriptions(rs.getNString(4));
                temp.setCategoryId(rs.getInt(5));
                list.add(temp);
            }
        } catch (Exception e) {
        }
        return list;
    }
    // lay danh sach user theo keyword

    public List<User> searchUsers(String txt) {
        String query = "SELECT * FROM [User]\n"
                + "WHERE (name like ? or email like ?) and isAdmin = 0";
        List<User> list = new LinkedList<User>();

        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            ps.setString(2, "%" + txt + "%");
            rs = ps.executeQuery();

            while (rs.next()) {
                User temp = new User();
                temp.setEmail(rs.getNString(1));
                temp.setPassword(rs.getString(2));
                temp.setName(rs.getNString(3));
                temp.setPhone(rs.getNString(4));
                temp.setAddress(rs.getNString(5));
                temp.setIsAdmin(rs.getBoolean(6));
                temp.setBirthday(rs.getDate(7));
                temp.setGender(rs.getBoolean(8));
                list.add(temp);
            }
        } catch (Exception e) {
        }
        return list;
    }

    //Lay tai khoan dang nhap
    public User getUser(String email, String password) {
        String query = "SELECT * FROM [User]\n"
                + "WHERE email = ? AND \n"
                + " password = ?";
        User temp = new User();
        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, password);
            rs = ps.executeQuery();

            while (rs.next()) {
                temp.setEmail(rs.getNString(1));
                temp.setPassword(rs.getString(2));
                temp.setName(rs.getNString(3));
                temp.setPhone(rs.getNString(4));
                temp.setAddress(rs.getNString(5));
                temp.setIsAdmin(rs.getBoolean(6));
                temp.setBirthday(rs.getDate(7));
                temp.setGender(rs.getBoolean(8));
                return temp;
            }
        } catch (Exception e) {
        }
        return null;
    }

    //check user is exist
    public boolean isExist(String email) {
        String query = "SELECT * FROM [User] \n"
                + "WHERE email =  ? ";
        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    //lay tai khoan
    public void createUser(String email, String password) {

        String query = "INSERT INTO [User] VALUES(?,?,?,?,?,?,?,?)";
        User temp = new User();
        try {
            connect = new DbContext().getConnection();
            Date dtDate = Date.valueOf("2000-01-01");
            ps = connect.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, password);
            ps.setString(3, "user0123");
            ps.setString(4, "NULL");
            ps.setString(5, "Viet Nam");
            ps.setInt(6, 0);
            ps.setDate(7, dtDate);
            ps.setInt(8, 0);
            rs = ps.executeQuery();

        } catch (Exception e) {
        }
    }

    //lay tai khoan
    public void createUser(String email, String password, String name, String sdt, int isAdmin) {

        String query = "INSERT INTO [User] VALUES(?,?,?,?,?,?,?,?)";
        User temp = new User();
        try {
            connect = new DbContext().getConnection();
            Date dtDate = Date.valueOf("2000-01-01");
            ps = connect.prepareStatement(query);
            ps.setString(1, email.trim());
            ps.setString(2, password.trim());
            ps.setString(3, name.trim());
            ps.setString(4, sdt.trim());
            ps.setString(5, "Viet Nam");
            ps.setInt(6, isAdmin);
            ps.setDate(7, dtDate);
            ps.setInt(8, 0);
            rs = ps.executeQuery();

        } catch (Exception e) {
        }
    }
    //doi mat khau

    public void changePass(String email, String password) {

        String query = "UPDATE [USER]\n"
                + "SET Password = ?\n"
                + "WHERE Email = ?";
        try {
            connect = new DbContext().getConnection();
            Date dtDate = Date.valueOf("2000-01-01");
            ps = connect.prepareStatement(query);
            ps.setString(2, email);
            ps.setString(1, password);
            rs = ps.executeQuery();
        } catch (Exception e) {
        }
    }

    //doi mat khau
    public User update(User o) {

        String query = "UPDATE [USER]\n"
                + "SET Name = ? , Phone = ?, Address = ?, birthday = ?, gender = ?\n"
                + "WHERE Email = ?";
        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            ps.setString(1, o.getName());
            ps.setString(2, o.getPhone());
            ps.setString(3, o.getAddress());
            ps.setString(4, o.getBirthday().toString());
            if (o.isGender()) {
                ps.setInt(5, 1);

            } else {
                ps.setInt(5, 0);
            }
            ps.setNString(6, o.getEmail());
            rs = ps.executeQuery();

        } catch (Exception e) {
        }
        User temp = getUser(o.getEmail().trim(), o.getPassword().trim());
        return temp != null ? temp : null;
    }

    //kiem tra don hang ton tai
    public Cart isExist(String email, int pid) {
        String query = "SELECT * FROM SHOPPINGCART \n"
                + "WHERE email =  ? AND id = ? ";
        try {
            Cart temp = new Cart();
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            ps.setString(1, email);
            ps.setInt(2, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                temp.setEmail(email);
                temp.setId(pid);
                temp.setAmount(rs.getInt(3));
                return temp;
            }
        } catch (Exception e) {
        }
        return null;
    }

    //them vao gio hang
    public void addToCart(String email, int pid, int amount) {

        String query = "INSERT INTO [SHOPPINGCART] VALUES(?,?,?)";

        try {

            connect = new DbContext().getConnection();
            Cart temp = isExist(email, pid);
            if (temp != null) {
                query = "UPDATE [SHOPPINGCART]\n"
                        + "SET  amount = ?\n"
                        + "WHERE Email = ? AND id = ?";
                ps = connect.prepareStatement(query);

                ps.setInt(1, temp.getAmount() + amount);
                ps.setNString(2, email.trim().toString());
                ps.setInt(3, pid);
            } else {
                ps = connect.prepareStatement(query);
                ps.setString(1, email);
                ps.setInt(2, pid);
                ps.setInt(3, amount);
            }

            rs = ps.executeQuery();

        } catch (Exception e) {
        }
    }

    //So san pham trong gio hang
    public int amountCartByEmail(String email) {
        String query = "SELECT * FROM SHOPPINGCART\n"
                + "WHERE Email = ?";
        List<Cart> list = new LinkedList<Cart>();

        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            ps.setString(1, email.toString().trim());
            rs = ps.executeQuery();

            while (rs.next()) {
                Cart temp = new Cart();
                temp.setId(rs.getByte(2));
                temp.setEmail(rs.getNString(1));
                temp.setAmount(rs.getInt(3));

                list.add(temp);
            }
        } catch (Exception e) {
        }
        return list.size() != 0 ? list.size() : 0;
    }

    // Danh sach san pham gio hang theo Email
    public List<CartView> productCartsByEmail(String email) {
        String query = "SELECT A.id, A.name, A.image, A.price, B.Amount\n"
                + "FROM Product A, ShoppingCart B\n"
                + "WHERE A.id = B.id AND B.Email = ?";

        List<CartView> list = new LinkedList<CartView>();

        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            ps.setString(1, email.toString().trim());
            rs = ps.executeQuery();

            while (rs.next()) {
                CartView temp = new CartView();
                temp.setIdSP(rs.getByte(1));
                temp.setTenSP(rs.getNString(2));
                temp.setHinhSP(rs.getNString(3).toString().trim());
                temp.setGiaSP(rs.getInt(4));
                temp.setSoLuong(rs.getInt(5));
                list.add(temp);
            }
        } catch (Exception e) {
        }
        return list;
    }
    //xoa Khoi gio hang

    public void deleteCart(String email, int pid) {

        String query = "DELETE \n"
                + "FROM  ShoppingCart\n"
                + "WHERE Email = ? AND id = ?";

        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            ps.setNString(1, email);
            ps.setInt(2, pid);
            rs = ps.executeQuery();

        } catch (Exception e) {
        }
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    //uPDATE TO cART
    public void updateCart(String email, int pid, int amount) {

        String query = "UPDATE ShoppingCart\n"
                + "SET  Amount = ?\n"
                + "WHERE Email = ? AND id = ?";

        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            ps.setInt(1, amount);
            ps.setNString(2, email);
            ps.setInt(3, pid);
            rs = ps.executeQuery();

        } catch (Exception e) {
        }
    }

    //Thanh toan
    public int taoBill(String email) {
        int idBill = getRandomNumber(100000, 999999);
        String query = "INSERT INTO [Bill] VALUES(?,?,?,?,?)";

        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            Date dtDate = Date.valueOf(LocalDate.now());
            ps.setInt(1, idBill);
            ps.setNString(2, email);
            ps.setInt(3, 0);
            ps.setDate(4, dtDate);
            ps.setInt(5, 0);
            rs = ps.executeQuery();
        } catch (Exception e) {
        }
        return idBill;
    }

    public void updateTongTien(int idBill, int tong) {
        String query = "UPDATE Bill\n"
                + "SET  Total = ?\n"
                + "WHERE idBill = ?";

        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            ps.setInt(1, tong);
            ps.setInt(2, idBill);
            rs = ps.executeQuery();

        } catch (Exception e) {
        }
    }

    //Xoa gio hang
    public void deleteAllCarts(String email) {

        String query = "DELETE \n"
                + "FROM  ShoppingCart\n"
                + "WHERE Email = ?";

        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            ps.setNString(1, email);
            rs = ps.executeQuery();

        } catch (Exception e) {
        }
    }

    //uPDATE TO cART
    public void checkout(String email) {

        //Danh sách san pham muon mua trong gio hang
        List<CartView> list = productCartsByEmail(email);

        //Tao Bill
        int idBill = taoBill(email);

        String query = "";
        int tong = 0;
        //Them vao chi tiet bill
        for (CartView cartView : list) {
            query += "INSERT INTO [BillDetails] VALUES(" + idBill + "," + cartView.getIdSP() + "," + cartView.getSoLuong() + ")\n";
            tong += cartView.getGiaSP() * cartView.getSoLuong();
        }
        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();

        } catch (Exception e) {
        }
        updateTongTien(idBill, tong);
        deleteAllCarts(email);
    }

    public List<BillDetail> getBillDetail(String email) {
        String query = "SELECT B.idBill ,B.ngayMua,C.amount,A.name, A.price*C.amount AS [TOTAL],B.tinhTrangGH\n"
                + "FROM Product A, Bill B, BillDetails C\n"
                + "WHERE A.id = C.id AND B.idBill = C.idBill AND B.Email = ?";
        List<BillDetail> list = new LinkedList<BillDetail>();
        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();

            while (rs.next()) {
                BillDetail temp = new BillDetail();
                temp.setIdBill(rs.getInt(1));
                temp.setNgayMua(rs.getDate(2));
                temp.setSoLuong(rs.getInt(3));
                temp.setTenSP(rs.getNString(4));
                temp.setTongTien(rs.getInt(5));
                temp.setTrangThai(rs.getBoolean(6));
                list.add(temp);
            }

        } catch (Exception e) {
        }

        return list;
    }

    //Xoa san pham
    public void deleteProduct(int pid) {

        String query = "DELETE \n"
                + "FROM  Product\n"
                + "WHERE  id = ?";

        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            ps.setInt(1, pid);
            rs = ps.executeQuery();

        } catch (Exception e) {
        }
    }
    //Xoa user

    public void deleteUser(String uid) {

        String query = "DELETE \n"
                + "FROM  [User]\n"
                + "WHERE  email = ?";

        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            ps.setNString(1, uid.trim());
            rs = ps.executeQuery();
            
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //lay categories theo id

    public Categories getCategoryById(int id) {
        String query = "SELECT * FROM Categories\n"
                + "WHERE id = ?";
        Categories temp = new Categories();
        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                temp.setId(rs.getInt(1));
                temp.setName(rs.getNString(2));
            }
        } catch (Exception e) {
        }
        return temp;
    }

    //create product
    public void createProduct(Product pd) {

        String query = "INSERT INTO [Product] VALUES(?,?,?,?,?)";

        String subDes = getCategoryById(pd.getCategoryId()).getName();
        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            ps.setString(1, pd.getName());
            ps.setString(2, pd.getImage());
            ps.setString(3, pd.getDescriptions() + " " + subDes);
            ps.setInt(4, pd.getCategoryId());
            ps.setInt(5, pd.getPrice());
            rs = ps.executeQuery();

        } catch (Exception e) {
        }
    }

    //Update product
    public Product update(Product o) {

        String query = "UPDATE [Product]\n"
                + "SET name = ? , image = ?, descriptions = ?, categoryId = ?, price = ?\n"
                + "WHERE id = ?";
        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            ps.setString(1, o.getName());
            ps.setString(2, o.getImage());
            ps.setString(3, o.getDescriptions());
            ps.setInt(4, o.getCategoryId());
            ps.setInt(5, o.getPrice());
            ps.setInt(6, o.getId());
            rs = ps.executeQuery();

        } catch (Exception e) {
        }
        Integer id = new Integer(o.getId());
        Product temp = getProductById(id.toString());
        return temp != null ? temp : null;
    }

    //Lay tat ca User
    public List<User> getAllUsers() {
        String query = "SELECT * FROM [User] \n" + ""
                + "Where isAdmin = ?";
        List<User> list = new LinkedList<User>();
        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            ps.setBoolean(1, false);
            rs = ps.executeQuery();

            while (rs.next()) {
                User temp = new User();
                temp.setEmail(rs.getNString(1));
                temp.setPassword(rs.getString(2));
                temp.setName(rs.getNString(3));
                temp.setPhone(rs.getNString(4));
                temp.setAddress(rs.getNString(5));
                temp.setIsAdmin(rs.getBoolean(6));
                temp.setBirthday(rs.getDate(7));
                temp.setGender(rs.getBoolean(8));
                list.add(temp);
            }

        } catch (Exception e) {
        }

        return list;
    }
    //BIll manager

    public List<BillStatus> getBillStatus() {
        String query = "SELECT B.idBill ,B.ngayMua,A.Name,a.Phone, b.Total,B.tinhTrangGH\n"
                + "FROM [User] A, Bill B\n"
                + "WHERE A.Email= B.Email";
        List<BillStatus> list = new LinkedList<BillStatus>();
        try {
            connect = new DbContext().getConnection();
            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                BillStatus temp = new BillStatus();
                temp.setId(rs.getInt(1));
                temp.setNgauMua(rs.getDate(2));
                temp.setTenKH(rs.getNString(3));
                 temp.setSdt(rs.getNString(4));
                temp.setTongTien(rs.getInt(5));
                temp.setTrangThai(rs.getBoolean(6));

                list.add(temp);
            }

        } catch (Exception e) {
        }
        return list;
    }
    
    //Update status Bill
    public void updateStatus(String id){
         String query = "UPDATE [Bill]\n"
                + "SET tinhTrangGH = ?\n"
                + "WHERE idBill = ?";
        try {
            connect = new DbContext().getConnection();
            Date dtDate = Date.valueOf("2000-01-01");
            ps = connect.prepareStatement(query);
            ps.setString(2, id);
            ps.setInt(1, 1);
            rs = ps.executeQuery();
        } catch (Exception e) {
        }
    }
}
