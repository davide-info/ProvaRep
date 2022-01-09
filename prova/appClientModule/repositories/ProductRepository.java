package repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import model.Product;

@Repository
public class ProductRepository {
@Autowired
private JdbcTemplate template;
public void addProduct(Product product) {
	String sql = "INSERT INTO product(name, price) VALUES(?,?)";
	template.update(sql, product.getName(), product.getPrice());
}
public List<Product> getProducts() {
	String sql= "SELECT * FROM Product ";
	
	return template.query(sql , new RowMapper<Product>() {

	
		public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
			Product product = new Product();
			product.setIdProduct(rs.getInt("idProduct"));
			product.setName(rs.getString("name"));
			product.setPrice(rs.getFloat("price"));
			
			return product;
		}
		
	});
	
}

}
