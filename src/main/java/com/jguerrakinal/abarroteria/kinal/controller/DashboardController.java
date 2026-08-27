package main.java.com.jguerrakinal.abarroteria.kinal.controller;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import main.java.com.jguerrakinal.abarroteria.kinal.model.Producto;
import main.java.com.jguerrakinal.abarroteria.kinal.service.AuthService;
import main.java.com.jguerrakinal.abarroteria.kinal.service.dashboard.DashboardService;
import main.java.com.jguerrakinal.abarroteria.kinal.service.usuario.UsuarioService;
import main.java.com.jguerrakinal.abarroteria.kinal.util.SceneManager;

public class DashboardController implements Initializable {
    
    private DashboardService dashboardService;
    private SceneManager sceneManager;
    
    @FXML
    private TableView<Producto> tableProducto;
    
    @FXML
    private TableColumn<Producto, String> tableColumnIdProducto;
    
    @FXML
    private TableColumn<Producto, String> tableColumnIdStock;
    
    @FXML
    private TableColumn<Producto, Integer> tableColumnStock;
    
    @FXML
    private TableColumn<Producto, BigDecimal> tableColumnPrecio;
    
    
    
    public DashboardController(DashboardService dashboardService, SceneManager sceneManager){
        this.dashboardService = dashboardService;
       this.sceneManager = sceneManager;
    }
    
 

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    private void handleLoadDataView(){
    
    }
    
}
