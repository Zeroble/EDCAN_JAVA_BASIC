public class Activity {
    private int contentView;
    public void setContentView(int resId){
        this.contentView = resId;
    }

    public View findViewById(int resId){
        return new TextView();
    }

    protected void onCreate(){

    }
    protected void onStop(){

    }
    protected void onStart(){

    }
    protected void onRestart(){

    }
    protected void ondestroy(){

    }
    protected void onResume(){

    }
    protected void onPausse(){

    }
}
