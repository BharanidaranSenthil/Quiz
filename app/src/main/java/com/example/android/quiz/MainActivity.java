  package com.example.android.quiz;
  import android.content.Intent;
  import android.net.Uri;
  import android.support.v7.app.AppCompatActivity;
  import android.os.Bundle;
  import android.view.View;
  import android.widget.CheckBox;
  import android.widget.EditText;
  import android.widget.RadioButton;
  import android.widget.RadioGroup;
  import android.widget.TextView;
  import android.widget.Toast;
  public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
    }
    public void submitOrder(View view)
    {
      EditText text= (EditText) findViewById(R.id.name_text_box);
      String value= text.getText().toString();
      // CHARLES BABBAGE
      CheckBox babbagecheckbox=(CheckBox) findViewById(R.id.Babbage_check_box);
      boolean hasbabbage=(babbagecheckbox.isChecked());
      //DENNIS RITCHIE
      CheckBox ritchiecheckbox=(CheckBox) findViewById(R.id.Ritchie_check_box);
      boolean hasritchie=!(ritchiecheckbox.isChecked());
      // THOMAS KENNEDY
      CheckBox kennedycheckbox=(CheckBox) findViewById(R.id.Kennedy_check_box);
      boolean haskennedy=!(kennedycheckbox.isChecked());
      //SUN BROTHERS
      CheckBox brotherscheckbox=(CheckBox) findViewById(R.id.brothers_check_box);
      boolean hasbrothers=!(brotherscheckbox.isChecked());


      // RANDOM ACCESS MEMORY
      CheckBox accesscheckbox=(CheckBox) findViewById(R.id.Random_check_box);
      boolean hasaccessbox=accesscheckbox.isChecked();
      //RANDOM AXXESS MEMORY
      CheckBox axxesscheckbox=(CheckBox) findViewById(R.id.Axxess_check_box);
      boolean hasaxxessbox=!(axxesscheckbox.isChecked());
      //ACCESS RANDOM MEMORY
      CheckBox randomcheckbox=(CheckBox) findViewById(R.id.Access_check_box);
      boolean hasrandombox=!(randomcheckbox.isChecked());
      //RANDOM MEMORY
      CheckBox randombox=(CheckBox) findViewById(R.id.Random_memory);
      boolean hasrandommemory=!(randombox.isChecked());


      // OPERATING SYSTEMS
      CheckBox systemcheckbox=(CheckBox)findViewById(R.id.Operating_systems);
      boolean hassystembox=systemcheckbox.isChecked();
      //COMPUTER NETWORKS
      CheckBox networkcheckbox=(CheckBox)findViewById(R.id.Computer_Networks);
      boolean hasnetworkbox=!(networkcheckbox.isChecked());
      //PROCESSING SYSTEMS
      CheckBox processingcheckbox=(CheckBox)findViewById(R.id.Processing_Systems);
      boolean hasprocessingbox=!(processingcheckbox.isChecked());
      //MSWINDOWS
      CheckBox windowscheckbox=(CheckBox)findViewById(R.id.MS_Windows);
      boolean haswindowsbox=!(windowscheckbox.isChecked());

      // XML
      CheckBox xmlcheckbox=(CheckBox)findViewById(R.id.XML);
        boolean hasxml=xmlcheckbox.isChecked();
        //HTML
      CheckBox htmlcheckbox=(CheckBox)findViewById(R.id.HTML);
      boolean hashtml=!(htmlcheckbox.isChecked());
      //CSS
      CheckBox csscheckbox=(CheckBox)findViewById(R.id.CSS);
      boolean hascss=!(csscheckbox.isChecked());
      //PHP
      CheckBox phpcheckbox=(CheckBox)findViewById(R.id.PHP);
      boolean hasphp=!(phpcheckbox.isChecked());


      //Keyboard
      CheckBox keyboardcheckbox=(CheckBox)findViewById(R.id.Keyboard);
      boolean haskeyboard=keyboardcheckbox.isChecked();
      //PRINTER
      CheckBox printercheckbox=(CheckBox)findViewById(R.id.Printer);
      boolean hasprinter=!(printercheckbox.isChecked());
      //XEROX
      CheckBox xeroxcheckbox=(CheckBox)findViewById(R.id.Xerox);
      boolean hasxerox=!(xeroxcheckbox.isChecked());
      //MONITOR
      CheckBox MONITORcheckbox=(CheckBox)findViewById(R.id.Monitor);
      boolean hasMONITOR=!(MONITORcheckbox.isChecked());


      //Monitor
      CheckBox monitorcheckbox=(CheckBox)findViewById(R.id.Monitor_check_box);
      boolean hasmonitor=monitorcheckbox.isChecked();
      //KEYBOARD
      CheckBox keycheckbox=(CheckBox)findViewById(R.id.Key);
      boolean haskey=!(keycheckbox.isChecked());
      //MOUSE
      CheckBox mousecheckbox=(CheckBox)findViewById(R.id.Mouse);
      boolean hasmouse=!(mousecheckbox.isChecked());
      //NONE OF ABOVE
      CheckBox nonecheckbox=(CheckBox)findViewById(R.id.None_check_box);
      boolean hasnone=!(nonecheckbox.isChecked());


      //MYSQL
      CheckBox sqlcheckbbox=(CheckBox)findViewById(R.id.mysql);
        boolean hasmysql=sqlcheckbbox.isChecked();
        //PHP
      CheckBox PHPcheckbox=(CheckBox)findViewById(R.id.PHP_check_box);
      boolean hasPHP=!(PHPcheckbox.isChecked());
      //JAVASCRIPT
      CheckBox javascriptcheckbox=(CheckBox)findViewById(R.id.javascript_check_box);
      boolean hasjavascript=!(javascriptcheckbox.isChecked());
      //NONE OF ABOVE
      CheckBox noneofabovecheckbox=(CheckBox)findViewById(R.id.None_Of_Above);
      boolean hasnoneofabove=!(noneofabovecheckbox.isChecked());


      //ClientSide
      CheckBox clientcheckbox=(CheckBox)findViewById(R.id.Clientside);
      boolean hasclientside=clientcheckbox.isChecked();
      //SERVERSIDE
      CheckBox servercheckbox=(CheckBox)findViewById(R.id.ServerSide);
      boolean hassererside=!(servercheckbox.isChecked());
      //BOTH AANDB
      CheckBox bothabcheckbox=(CheckBox)findViewById(R.id.Both_A_B);
      boolean hasboth=!(bothabcheckbox.isChecked());
      //NONE OF
      CheckBox noneofcheckbox=(CheckBox)findViewById(R.id.None_Of);
      boolean hasnoneof=!(noneofcheckbox.isChecked());


      // Cascading Style Sheets
      CheckBox cascadingcheckbox=(CheckBox)findViewById(R.id.Cascading);
      boolean hascascading=cascadingcheckbox.isChecked();
      //CASCADING STEEL SHEET
      CheckBox steelcheckbox=(CheckBox)findViewById(R.id.Cascading_Steel);
      boolean hassteel=!(steelcheckbox.isChecked());
      //CASCADING STYLISH SHEETS
      CheckBox stylishcheckbox=(CheckBox)findViewById(R.id.Cascading_stylish);
      boolean hasstylish=!(stylishcheckbox.isChecked());
      //NONE OF ABOVE
      CheckBox noneofthesecheckbox=(CheckBox)findViewById(R.id.Noneof_these);
      boolean hasnoneofthese=!(noneofthesecheckbox.isChecked());


      // Google Chrome
      RadioButton chromecheckbox=(RadioButton) findViewById(R.id.Chrome);
      boolean haschrome=chromecheckbox.isChecked();
      //INTERNET EXPLORER
      RadioButton explorercheckbox=(RadioButton)findViewById(R.id.Explorer);
      boolean hasexplorer=!(explorercheckbox.isChecked());
      //GMAIL
      RadioButton gmailcheckbox=(RadioButton) findViewById(R.id.Gmail);
      boolean hasgmail=!(gmailcheckbox.isChecked());
      //youtube
      RadioButton youtubecheckbox=(RadioButton) findViewById(R.id.youtube);
      boolean hasyoutube=!(youtubecheckbox.isChecked());

      //  MARK CALCULATION
      int marks=calculatemarks(hasbabbage,hasritchie,haskennedy,hasbrothers,hasaccessbox,hasaxxessbox,hasrandombox,hasrandommemory,hassystembox,hasnetworkbox,hasprocessingbox,haswindowsbox,hasxml,hascss,hasphp,hashtml,haskeyboard,hasprinter,hasxerox,hasMONITOR,hasmonitor,haskey,hasmouse,hasnone,hasmysql,hasPHP,hasjavascript,hasnoneofabove,hasclientside,hassererside,hasboth,hasnoneof,hascascading,hassteel,hasstylish,hasnoneofthese,haschrome,hasexplorer,hasgmail,hasyoutube);
      String totalmarks=createOrder(value,marks,hasbabbage,hasaccessbox,hassystembox,hasxml,haskeyboard,hasmonitor,hasmysql,hasclientside,hascascading,haschrome);
      displayMessage(totalmarks);
      Intent intent = new Intent(Intent.ACTION_SENDTO);
      intent.setData(Uri.parse("mailto:")); // only email apps should handle this
      intent.putExtra(Intent.EXTRA_SUBJECT, "MARKS DETAILS");
      intent.putExtra(Intent.EXTRA_TEXT,totalmarks);
      if (intent.resolveActivity(getPackageManager()) != null) {
        startActivity(intent);
      }
    }
    private int calculatemarks(boolean hasbabbage,boolean hasritchie,boolean haskennedy,boolean hasbrothers,boolean hasaccessbox,boolean hasaxxessbox,boolean hasrandombox,boolean hasrandommemory, boolean hassystembox,boolean hasnetworkbox,boolean hasprocessingbox,boolean haswindowsbox,boolean hasxml,boolean hascss,boolean hasphp,boolean hashtml,boolean haskeyboard,boolean hasprinter,boolean hasxerox,boolean hasMONITOR,boolean hasmonitor,boolean haskey,boolean hasmouse,boolean hasnone,boolean hasmysql,boolean PHP,boolean javascript,boolean hasnoneofabove,boolean hasclientside,boolean hassererside,boolean hasboth,boolean hasnoneof,boolean hascascading,boolean hassteel,boolean hasstylish,boolean hasnoneofthese,boolean haschrome,boolean hasexplorer,boolean hasgmail,boolean hasyoutube)
    {
      int total=0;
      if((hasbabbage && hasritchie) && (haskennedy && hasbrothers))
      {
        total=total+1;
      }
      if((hasaccessbox && hasaxxessbox) && (hasrandombox && hasrandommemory))
      {
        total=total+1;
      }
      if((hassystembox && hasnetworkbox) && (hasprocessingbox  && haswindowsbox))
      {
        total=total+1;
      }
      if((hasxml && hascss) && (hasphp && hashtml))
      {
        total=total+1;
      }
      if((haskeyboard && hasprinter) && (hasxerox && hasMONITOR))
      {
        total=total+1;
      }
      if((hasmonitor && haskey) && (hasmouse && hasnone))
      {
        total=total+1;
      }
      if((hasclientside && hassererside) && (hasboth && hasnoneof))
      {
        total=total+1;
      }
      if((hasmysql && PHP) && (javascript && hasnoneofabove))
      {
        total=total+1;
      }
      if((hascascading && hassteel) && (hasstylish && hasnoneofthese))
      {
        total=total+1;
      }
      if((haschrome && hasexplorer) && (hasgmail && hasyoutube))
      {
        total=total+1;
      }

      return total;
    }
    private String createOrder(String value,int marks,boolean hasbabbage,boolean hasaccessbox, boolean hassystembox,boolean hasxml,boolean haskeyboard,boolean hasmonitor,boolean hasmysql,boolean hasclientside,boolean hascascading,boolean haschrome)
    {
      String totmar="\n"+"Name:"+value+"\n"+"Marks Out of 10: " +"\n"+ marks +"\n" +"Your Answers are:"+ "\n"+ "1."+ hasbabbage + "\n" + "2."+ hasaccessbox +"\n"+"3."+hassystembox+"\n"+"4."+hasxml+"\n"+"5."+haskeyboard+"\n"+"6."+hasmonitor+"\n"+"7."+hasmysql+"\n"+"8."+hasclientside+"\n"+"9."+hascascading+"\n"+"10."+haschrome;
      return totmar;
    }
    private void displayMessage(String message) {
      Toast.makeText(this,"CHECK OUT YOUR SCORE"+message,Toast.LENGTH_SHORT).show();
      return;
    }
  }

