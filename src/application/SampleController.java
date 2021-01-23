package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.Observable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Callback;

import org.kairos.components.RippleViewRow;
import org.kairos.layouts.RecyclerView;
import org.kairos.layouts.RecyclerView.ViewRow;

public class SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private RecyclerView<Model> recyclerView;

    @FXML
    void initialize() {
    	
    	Adapter adapter=new Adapter();
    	recyclerView.setAdapter(adapter);
    	
    	Model model=new Model("/images/1.png", "Ýlyas Aktas", "aktas@gmail.com");
    	Model model1=new Model("/images/2.png", "Yahya Alatas", "aktas@gmail.com");
    	Model model2=new Model("/images/3.png", "Beyza Gurocak", "aktas@gmail.com");
    	Model model3=new Model("/images/4.png", "Nurullah Konak", "aktas@gmail.com");
    	Model model4=new Model("/images/5.png", "Salim  Akpolat", "aktas@gmail.com");
    	Model model5=new Model("/images/6.png", "Simge Sarakurt", "aktas@gmail.com");
    	Model model6=new Model("/images/7.png", "Ahmet Kaya", "aktas@gmail.com");
    	Model model7=new Model("/images/8.png", "Serzan Canalir", "aktas@gmail.com");
    	Model model8=new Model("/images/9.png", "Mustafa Kilinc", "aktas@gmail.com");
    	recyclerView.getItems().addAll(model,model1,model2,model3,model4,model5,model6,model7,model8);
    	
    recyclerView.getSelectionModel().selectedItemProperty().addListener((Observable,oldValue,newValue)->{
    	System.out.println(newValue.name);
    });
       

    }
    
    
    public class Adapter extends RecyclerView.Adapter<Holder>{
    	
    	@Override
    	public RecyclerView.ViewRow call(ListView param) {
    		
    		return new RippleViewRow(this);
    	}

		@Override
		public void onBindViewHolder(Holder holder, Object o) {
			
			Model model=(Model)o;
			
			holder.image.setImage(new Image(model.getImageSrc()));
			holder.name.setText(model.getName());
			holder.username.setText(model.getUsername());
			
		}

		@Override
		public Holder onCreateViewHolder(FXMLLoader fxmlLoader) {
			fxmlLoader.setLocation(getClass().getResource("cardview.fxml"));
			
			Holder holder=new Holder(fxmlLoader);
			return holder;
		}
    	
    }
    
    public class Holder extends RecyclerView.ViewHolder{
    	
        @FXML
        private ImageView image;

        @FXML
        private Label name;

        @FXML
        private Label username;

		public Holder(FXMLLoader arg0) {
			super(arg0);
			// TODO Auto-generated constructor stub
		}
    	
    }
}
