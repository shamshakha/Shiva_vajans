package com.example.shiva_vajans;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mritunjay_btn ;
    private Button tandav_btn ;
    private Button jyotirling_btn ;
    private Button dwadash_btn ;
    private Button bolo_bolo_btn ;
    private Button satyam_shivam_btn ;
    private Button ekbar_btn ;
    private Button karpur_btn ;
    private Button shankar_shiv_btn ;
    private Button panchyaskari_btn ;
    private Button sadaskara_btn ;
    private Button shiv_omkara_btn ;
    private Button rudra_btn ;
    private Button namaskaratha_mantra_btn ;
    private Button maha_shivratri_btn ;
    private Button om_btn ;
    private Button damru_btn ;
    private Button lagi_teri_btn ;
    private Button namo_namo_btn ;
    private Button shamshan_btn ;
    private Button bhola_bhandari_btn ;
    private Button jaikal_btn ;
    private Button bam_lahri_btn ;
    private Button gayatri_btn ;
    private Button shankara_btn ;
    private Button stuti_btn ;
    private Button pravu_btn ;
    private Button chalisa_btn ;
    private Button natraj_btn ;
    private Button kailash_btn ;
    private Button yagya_btn ;
//    private Button sotonam_btn ;
//    private Button choutrish_btn ;
//    private Button shukh_sari_btn ;
    private Button jyotirlingg_btn ;
    private Button shiv_btn ;
//    //  private TextView play_btn ;
    private MediaPlayer mediaPlayer;
    //  public static int[] SoundIndex;
//  public static int position = 0;
    //  private int[] soundIndex= { R.raw.gurudebo, R.raw.provat, R.raw.bibhabori, R.raw.rai_jago, R.raw.rai_jago_go, R.raw.jagiya_loho_krishna_nam, R.raw.nomo_nomo_tulsi, R.raw.mongal_dweep, R.raw.baisnab_thakur, R.raw.hori_haraye_namo_krishna,
    //          R.raw.bhojo_gourango, R.raw.gai_gora, R.raw.gai_gorachad, R.raw.hare_krishno_naam, R.raw.joyo_joyo_jagannath, R.raw.he_gobindho_rakho, R.raw.gopalke_dhore, R.raw.e_shyam_jokhon_tokhon, R.raw.joy_radhe_radhe, R.raw.achhe_gour_nitai,
    //         R.raw.tumi_krishna_tumi_bishnu, R.raw.horinam_satto, R.raw.ekhono_sei_radharani, R.raw.ke_anilo_re, R.raw.guru_na_bhoje, R.raw.hori_dinto_gelo_sondya_holo, R.raw.jai_radhe_jai_krishna_jai_vrindavan, R.raw.kunja_sajao, R.raw.hrid_majhare, R.raw.bonomali_tumi,
    //         R.raw.binodini_rai, R.raw.sotonam, R.raw.choutris_podabodi, R.raw.shuk_sharir_dwando, R.raw.sriradhar_baromash, R.raw.radha_astottor_sotonam
    //   };
//    int mCompleted = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mritunjay_btn = findViewById(R.id.mritunjay);
        tandav_btn = findViewById(R.id.tandav);
        jyotirling_btn = findViewById(R.id.jyotirling);
        dwadash_btn = findViewById(R.id.dwadash);
        bolo_bolo_btn = findViewById(R.id.bolo_bolo);
        satyam_shivam_btn = findViewById(R.id.satyam);
        ekbar_btn = findViewById(R.id.ekbar);
        karpur_btn = findViewById(R.id.karpur);
        shankar_shiv_btn = findViewById(R.id.shankar_shiv);
        panchyaskari_btn = findViewById(R.id.panchyaskari);
        sadaskara_btn = findViewById(R.id.sadakshara);
       shiv_omkara_btn = findViewById(R.id.shiv_omkara);
        rudra_btn = findViewById(R.id.rudra);
        namaskaratha_mantra_btn = findViewById(R.id.namaskaratha_mantra);
        maha_shivratri_btn = findViewById(R.id.maha_shivartri);
        om_btn = findViewById(R.id.om);
        damru_btn = findViewById(R.id.damru);
        lagi_teri_btn = findViewById(R.id.lagi_teri);
        namo_namo_btn = findViewById(R.id.namo_namo);
        shamshan_btn = findViewById(R.id.shamshan);
        bhola_bhandari_btn = findViewById(R.id.bhola_bhandari);
        jaikal_btn = findViewById(R.id.jaikal);
        bam_lahri_btn = findViewById(R.id.bam_lahiri);
        gayatri_btn = findViewById(R.id.gayatri);
        shankara_btn = findViewById(R.id.shankara);
        stuti_btn = findViewById(R.id.stuti);
        pravu_btn = findViewById(R.id.pravu);
        chalisa_btn = findViewById(R.id.chalisa);
        natraj_btn = findViewById(R.id.natraj);
        kailash_btn = findViewById(R.id.kailash);
        yagya_btn = findViewById(R.id.yagya);
        jyotirlingg_btn = findViewById(R.id.jyotirlingg);
        shiv_btn = findViewById(R.id.shiv);
//        //  play_btn = findViewById(R.id.play);



        mritunjay_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                open_mritunjay();


            }

        });
        tandav_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_tandav();

            }

        });

        jyotirling_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_jyotirling();

            }

        });
        dwadash_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_dwadash();

            }

        });

        bolo_bolo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_bolo_bolo();

            }

        });

        satyam_shivam_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_satyam();

            }

        });
        ekbar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_ekbar();

            }

        });
        karpur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_karpur();

            }

        });
        shankar_shiv_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_shankar_shiv();

            }

        });
        panchyaskari_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_pachyaskari();

            }

        });
        sadaskara_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_sadaskara();

            }

        });
        shiv_omkara_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_shiv_omkara();

            }

        });
        rudra_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_rudra();

            }

        });
        namaskaratha_mantra_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_namaskaratha_mantra();

            }

        });
        maha_shivratri_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_maha_shivratri();

            }

        });
        om_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_om();

            }

        });
        damru_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_damru();

            }

        });
        lagi_teri_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_lagi_teri();

            }

        });
        namo_namo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_namo_namo();

            }

        });
        shamshan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_shamshan();

            }

        });
        bhola_bhandari_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_bhola_bhandari();

            }

        });
        jaikal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_jaikal();

            }

        });
        bam_lahri_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_bam_lahri();

            }

        });
        gayatri_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_gayatri();

            }

        });
        shankara_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_shankara();

            }

        });
        stuti_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_stuti();

            }

        });
        pravu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_pravu();

            }

        });
        chalisa_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_chalisa();

            }

        });
        natraj_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_natraj();

            }

        });
        kailash_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_kailash();

            }

        });
        yagya_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_yagya();

            }

        });
//
        jyotirlingg_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_jyotirlingg();

            }

        });
//
        shiv_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_shiv();

            }

        });

        //    play_btn.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
        //        open_loop_music();
        //   }
        //      });



    }


    // public void open_loop_music()
    //  {
    //    mediaPlayer = MediaPlayer.create(getApplicationContext(), soundIndex[position]);
    //  mediaPlayer.start();
    // mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
    //     @Override
    //      public void onCompletion(MediaPlayer mp) {
    //             position++;
    //             if(position>=soundIndex.length)
    //                  position=0;
    //             open_loop_music();
    //      }

    //    });
    //   }
    public void open_mritunjay () {
        //StartAppAd.showAd(this);
        // this.finish();
        //  mediaPlayer.stop();
        Intent intent = new Intent(this, Mritunjay.class);
        startActivity(intent);
    }

    public void open_tandav () {
        //StartAppAd.showAd(this);
        //  this.finish();
        //  mediaPlayer.stop();
        Intent intent = new Intent(this, Shiv_tandav.class);
        startActivity(intent);
    }
    public void open_jyotirling () {
        //StartAppAd.showAd(this);
        //  this.finish();
        //  mediaPlayer.stop();
        Intent intent = new Intent(this, Jyotirling_ka_dhyan.class);
        startActivity(intent);
    }
     public void open_dwadash () {
        //StartAppAd.showAd(this);
        // this.finish();
        //  mediaPlayer.stop();
        Intent intent = new Intent(this, Dwadash.class);
        startActivity(intent);
     }
    public void open_bolo_bolo () {
        //StartAppAd.showAd(this);
        // this.finish();
        //  mediaPlayer.stop();
       Intent intent = new Intent(this, Bolo_bolo.class);
        startActivity(intent);
   }
   public void open_satyam () {
        //StartAppAd.showAd(this);
        //  this.finish();
        //   mediaPlayer.stop();
        Intent intent = new Intent(this, Satyam_shivam.class);
        startActivity(intent);
    }
    public void open_ekbar () {
        //StartAppAd.showAd(this);
        //   this.finish();
        //  mediaPlayer.stop();
        Intent intent = new Intent(this, Ekbar.class);
        startActivity(intent);
    }
    public void open_karpur () {
        //StartAppAd.showAd(this);
        //  this.finish();
        // mediaPlayer.stop();
        Intent intent = new Intent(this, Karpur.class);
        startActivity(intent);
    }
    public void open_shankar_shiv () {
        //StartAppAd.showAd(this);
        //   this.finish();
        //  mediaPlayer.stop();
        Intent intent = new Intent(this, Shankar_shiv.class);
       startActivity(intent);
    }
    public void open_pachyaskari () {
        //StartAppAd.showAd(this);
        //   this.finish();
        //   mediaPlayer.stop();
        Intent intent = new Intent(this, Panchyaskari.class);
        startActivity(intent);
   }
    public void open_sadaskara () {
        //StartAppAd.showAd(this);
        //   this.finish();
        //   mediaPlayer.stop();
        Intent intent = new Intent(this, Sadakshara.class);
        startActivity(intent);
    }
    public void open_shiv_omkara () {
        //StartAppAd.showAd(this);
        //   this.finish();
        //   mediaPlayer.stop();
       Intent intent = new Intent(this, Shiv_omkara.class);
        startActivity(intent);
    }
    public void open_rudra () {
        //StartAppAd.showAd(this);
        //    this.finish();
        //    mediaPlayer.stop();
        Intent intent = new Intent(this, Rudrastak.class);
        startActivity(intent);
    }
    public void open_namaskaratha_mantra () {
        //StartAppAd.showAd(this);
        //    this.finish();
        //   mediaPlayer.stop();
        Intent intent = new Intent(this, Namaskaratha_mantra.class);
       startActivity(intent);
   }
    public void open_maha_shivratri () {
        //StartAppAd.showAd(this);
        // this.finish();
        // mediaPlayer.stop();
       Intent intent = new Intent(this, Maha_shivratri.class);
        startActivity(intent);
    }
    public void open_om () {
        //StartAppAd.showAd(this);
        //  this.finish();
        //   mediaPlayer.stop();
        Intent intent = new Intent(this, Om.class);
        startActivity(intent);
    }
    public void open_damru () {
        //StartAppAd.showAd(this);
        //    this.finish();
        //   mediaPlayer.stop();
        Intent intent = new Intent(this, Damru.class);
        startActivity(intent);
    }

    public void open_lagi_teri () {
        //StartAppAd.showAd(this);
        //    this.finish();
        //    mediaPlayer.stop();
        Intent intent = new Intent(this, Lagi_teri.class);
        startActivity(intent);
    }
    public void open_namo_namo () {
//        //StartAppAd.showAd(this);
//        //    this.finish();
//        //    mediaPlayer.stop();
        Intent intent = new Intent(this, Namo_namo.class);
       startActivity(intent);
     }
    public void open_shamshan () {
//        //StartAppAd.showAd(this);
//        //    this.finish();
//        // mediaPlayer.stop();
        Intent intent = new Intent(this, Shamshan.class);
        startActivity(intent);
    }
    public void open_bhola_bhandari () {
//        //StartAppAd.showAd(this);
//        //      this.finish();
//        //     mediaPlayer.stop();
        Intent intent = new Intent(this, Bhola_bhandari.class);
        startActivity(intent);
    }
    public void open_jaikal () {
//        //StartAppAd.showAd(this);
//        //      this.finish();
//        //      mediaPlayer.stop();
        Intent intent = new Intent(this, Jaikal.class);
        startActivity(intent);
    }
    public void open_bam_lahri () {
//        //StartAppAd.showAd(this);
//        //   this.finish();
//        //     mediaPlayer.stop();
        Intent intent = new Intent(this, Bam_lahri.class);
        startActivity(intent);
    }
    public void open_gayatri () {
//        //StartAppAd.showAd(this);
//        //   this.finish();
//        //      mediaPlayer.stop();
        Intent intent = new Intent(this, Gayatri.class);
        startActivity(intent);
    }
    public void open_shankara () {
//        //StartAppAd.showAd(this);
//        //    this.finish();
//        //    mediaPlayer.stop();
        Intent intent = new Intent(this, Shankara.class);
        startActivity(intent);
    }
    public void open_stuti () {
//        //StartAppAd.showAd(this);
//        //     this.finish();
//        //    mediaPlayer.stop();
        Intent intent = new Intent(this, Stuti.class);
        startActivity(intent);
    }
    public void open_pravu () {
//        //StartAppAd.showAd(this);
//        //    this.finish();
//        //    mediaPlayer.stop();
        Intent intent = new Intent(this, Pravu.class);
        startActivity(intent);
    }
    public void open_chalisa () {
//        //StartAppAd.showAd(this);
//        //     this.finish();
//        //    mediaPlayer.stop();
        Intent intent = new Intent(this, Chalisa.class);
        startActivity(intent);
    }
    public void open_natraj () {
//        //StartAppAd.showAd(this);
//        //     this.finish();
//        //    mediaPlayer.stop();
        Intent intent = new Intent(this, Natraj.class);
        startActivity(intent);
    }
    public void open_kailash () {
//        //StartAppAd.showAd(this);
//        //    this.finish();
//        //     mediaPlayer.stop();
        Intent intent = new Intent(this, Kailash.class);
        startActivity(intent);
    }
    public void open_yagya () {
//        //StartAppAd.showAd(this);
//        //    this.finish();
//        //     mediaPlayer.stop();
        Intent intent = new Intent(this, Yagya.class);
        startActivity(intent);
    }
//    public void open_sotonam () {
//        //StartAppAd.showAd(this);
//        //    this.finish();
//        //     mediaPlayer.stop();
//        Intent intent = new Intent(this, Sotonam.class);
//        startActivity(intent);
//    }
//    public void open_choutrish () {
//        //StartAppAd.showAd(this);
//        //  this.finish();
//        //   mediaPlayer.stop();
//        Intent intent = new Intent(this, Choutrish.class);
//        startActivity(intent);
//    }
//    public void open_shukh_sari () {
//        //StartAppAd.showAd(this);
//        //    this.finish();
//        //     mediaPlayer.stop();
//        Intent intent = new Intent(this, Shukh_sari.class);
//        startActivity(intent);
//    }
//
    public void open_jyotirlingg () {
//        //StartAppAd.showAd(this);
//        //     this.finish();
//        //     mediaPlayer.stop();
        Intent intent = new Intent(this, Jyotirlingg.class);
       startActivity(intent);
    }
//
    public void open_shiv () {
//        //StartAppAd.showAd(this);
//        //    this.finish();
//        //    mediaPlayer.stop();
        Intent intent = new Intent(this, Shiv.class);
        startActivity(intent);
    }
//
//

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.title1){
            Intent intent = new Intent(this, Contact.class);
            startActivity(intent);

        }

        if(id==R.id.title2){
            Uri uri= Uri.parse("https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName());

            if(!isconnected(this))
            {
                Intent intent=new Intent(this,No_internet.class);
                startActivity(intent);
            }
            else {
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }

        }

        if(id==R.id.title3){
            try {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My application name");
                String shareMessage= "\nLet me recommend you this application\n\n";
                shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID + "\n\n";
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                startActivity(Intent.createChooser(shareIntent, "Share with"));
            } catch(Exception e) {
                Toast.makeText(MainActivity.this,"Can not Share an error occured", Toast.LENGTH_LONG).show();
            }
        }

        return super.onOptionsItemSelected(item);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    private boolean isconnected(MainActivity sust) {

        ConnectivityManager connectivityManager=(ConnectivityManager)sust.getSystemService(Context.CONNECTIVITY_SERVICE);

       NetworkInfo wificon=connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        NetworkInfo mobilecon=connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

        if(( wificon!=null && wificon.isConnected() ) || (mobilecon!=null && mobilecon.isConnected()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}