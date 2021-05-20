package controller;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import java.sql.*;

public class MainController {

	public static Connection con;
	public static Statement stmt;
	@FXML public Pane body;
	@FXML public ComboBox WyborFilmu;
	@FXML public  ViewController ViewController = new ViewController();;

	@FXML public void initialize() {
		this.PolaczZBazaDanych();
		ViewController.init(this);
		System.out.println("MainController init");
		WyborFilmu.getItems().addAll("logowanie", "Rejestracja", "ADodatki", "AUzytkownicy","AFilmy","URecenzja","UWybor_filmu"
		,"UWybor_miejsca","UWybor_dodatkow");
	}
	public void Wybierz(){
		ViewController.changeBody(WyborFilmu.getValue()+"");
	}
	private void PolaczZBazaDanych(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://sql11.freemysqlhosting.net/sql11412360","sql11412360","MLKI6a5Yh3");
			stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from filmy");
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}catch(Exception e){
			System.out.println(e);
		}
	}


}