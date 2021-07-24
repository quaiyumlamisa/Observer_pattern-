package application;
	

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage stage)
	
	{
		try {
			
			Auctioneer auc=new Auctioneer();
			
			Bidder b1= new Bidder("1");
			Bidder b2= new Bidder("2");
			Bidder b3= new Bidder("3");
			
			auc.register(b1);
			auc.register(b2);
			auc.register(b3);
			
			String price=Double.toString(Auctioneer.cprice);
			
			Label label1 = new Label("Bider1: ");
		    Label label2 = new Label("Bider2: ");
		    Label label3=new Label("Bider3: ");
		    Label label4=new Label("Auctioneer: ");
			
			TextField bidder1 = new TextField ();
	        TextField bidder2 = new TextField ();
	        TextField bidder3 = new TextField ();
	        TextField auctioneer = new TextField (price);
	        
	               
	        Button button1 = new Button("bid1");
	        Button button2 = new Button("bid2");
	        Button button3= new Button("bid3");
	        
	        Button button4 = new Button("Exit");
	       
	        
	       
	        
	        button1.setOnAction(e -> 
	        {
	            String price1 = bidder1.getText();
	            b1.bid(price1);            
	            String p= Auctioneer.s;
	        	String[] p1=p.split(" ,");
	         
	           	           
	            bidder1.setText(p1[0]);
	            bidder2.setText(p1[1]);
	            bidder3.setText(p1[2]);
	            auctioneer.setText(p1[0]);
	                    
	         });
	        
	        
	        
	        button2.setOnAction(e ->
	        {
	           	String price2 = bidder2.getText();
	            b2.bid(price2);	            
	            String p= Auctioneer.s;           
	            String[] p1=p.split(" ,");	           
	            bidder1.setText(p1[0]);
	            bidder2.setText(p1[1]);
	            bidder3.setText(p1[2]);
	            auctioneer.setText(p1[0]);
	                    
	         });
	        
	        
	        
	        button3.setOnAction(e ->
	        {	        
	            String price3 = bidder3.getText();
	            b3.bid(price3);	            
	            String p= Auctioneer.s;	          
	            String[] p1=p.split(" ,");
	            bidder1.setText(p1[0]);
	            bidder2.setText(p1[1]);
	            bidder3.setText(p1[2]);
	            auctioneer.setText(p1[0]);
	                    
	         });
	        
	        button4.setTranslateX(700);
	        button4.setTranslateY(30);
	        
	        button4.setOnAction(e ->
	        {
	       
	            Platform.exit();
	        });
	        
	       
	        
	        
	        
	        HBox box1 = new HBox(5);
	        box1.setPadding(new Insets(25, 25 ,25, 280));
	        box1.getChildren().addAll(label4,auctioneer);
	        
	        
	        HBox box2 = new HBox(5);
	        box2.setSpacing(10); 
	        box2.setPadding(new Insets(100, 40 , 100,30));
	        box2.getChildren().addAll(label1,bidder1,button1, label2,bidder2,button2,label3,bidder3,button3);
	      
	        

	        Group root = new Group(box1,box2,button4);
	        
	        Scene scene = new Scene(root, 800, 250, Color.BEIGE);
	        stage.setTitle("Auction system");
	        stage.setScene(scene);
	        stage.show();
	        
	       
	        
			
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		
		
	}
}
