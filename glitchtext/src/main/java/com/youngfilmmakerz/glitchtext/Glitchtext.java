package com.youngfilmmakerz.glitchtext;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Glitchtext extends RelativeLayout {

    RelativeLayout layout = null;
    TextView tv_redttext = null;
    TextView tv_bluetext = null;
    TextView tv_maintext = null;
    Context mContext = null;

    String maintext;
    String rightText;
    Typeface type=null;

    public Glitchtext(Context context) {
        super(context);
        mContext = context;
    }

    public Glitchtext(Context context, AttributeSet attrs) {
        super(context, attrs);

        mContext = context;

        TypedArray a = mContext.obtainStyledAttributes(attrs, R.styleable.GlitchTextt);


        //a = getContext().obtainStyledAttributes(attrs, R.styleable.DoubleText);

        this.maintext = a.getString(R.styleable.GlitchTextt_text);



        maintext = maintext == null ? "" : maintext;


        String service = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater) getContext().getSystemService(service);

        layout = (RelativeLayout) li.inflate(R.layout.glitch_text, this, true);

        tv_redttext = (TextView) layout.findViewById(R.id.tv_redttext);
        tv_bluetext = (TextView) layout.findViewById(R.id.tv_bluetext);
        tv_maintext = (TextView) layout.findViewById(R.id.tv_maintext);

        tv_redttext.setText(maintext);
        tv_bluetext.setText(maintext);
        tv_maintext.setText(maintext);

        a.recycle();
    }

    public Glitchtext(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mContext = context;
    }

    @SuppressWarnings("unused")
    public void setMaintext(String text) {
        tv_redttext.setText(text);
        tv_bluetext.setText(text);
        tv_maintext.setText(text);
    }

    @SuppressWarnings("unused")
    public void setTextsize(int text) {
        tv_redttext.setTextSize(TypedValue.COMPLEX_UNIT_SP,text);
        tv_bluetext.setTextSize(TypedValue.COMPLEX_UNIT_SP,text);
        tv_maintext.setTextSize(TypedValue.COMPLEX_UNIT_SP,text);
    }


    @SuppressWarnings("unused")
    public String getMaintext() {
        return tv_redttext.getText().toString();
    }



    public void setFontstyle(String path) {

         type = Typeface.createFromAsset(getContext().getAssets(),""+path);


        tv_redttext.setTypeface(type);
        tv_bluetext.setTypeface(type);
        tv_maintext.setTypeface(type);
    }

}
