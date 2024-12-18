package main;

import entity.*;
import util.*;
import util.AlurCerita;


public class MainCerita {
  public static void main(String[] args) {
    AlurCerita ceritaUtama = new AlurCerita();

    ceritaUtama.createRoot("prolog");

    // Input Ke kiri
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("act1"), "kiri", "prolog");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("act2.1"), "kiri", "act1");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("act2.2"), "kanan", "act1");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("act3.1"), "kiri", "act2.1");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("act4.1"), "kiri", "act3.1");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("act4.2"), "kanan", "act3.1");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("end1"), "kiri", "act4.1");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("end2"), "kanan", "act4.1");

    // Input Ke Kanan
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("end3"), "kanan", "act3.1");  
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("end4"), "kanan", "act2.1");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("end7"), "kanan", "act2.2");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("act4.3"), "kiri", "act2.2");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("end5"), "kiri", "act4.3");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("end6"), "kanan", "act4.3");

    // Input Dialog pada Prolog
    ceritaUtama.root.tambahDialog("[Narator] Di sebuah desa yang terletak di lembah hijau, kedamaian terusik oleh teriakan dan suara pedang.");
    ceritaUtama.root.tambahDialog("[Narator] Para prajurit kerajaan utusan dewa menyerbu tanpa ampun, membakar rumah dan membunuh penduduk tanpa alasan yang jelas.");
    ceritaUtama.root.tambahDialog("[Narator] Ananta dan Wadis datang ketika mendengar kegaduhan tersebut.");
    ceritaUtama.root.tambahDialog("[Narator] Dari kejauhan terlihat Khair yang sedang menyembuhkan korban kegaduhan tersebut.");
    ceritaUtama.root.tambahDialog("[Narator] Khair saat itu tidak memiliki pelindung atau bahkan teman bersama untuk mengatasi kegaduhan.");
    ceritaUtama.root.tambahDialog("Ananta : 'Sepertinya kita perlu membantu mereka'");
    ceritaUtama.root.tambahDialog("Wadis : 'Ayo!!!'");
    ceritaUtama.root.tambahDialog("[Narator] Mereka akhirnya bekerjasama untuk menaklukan prajurit-prajurit kejam tersebut.");

    // Input Dialog pada Act 1
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "prolog",
    "[Narator] Setelah meninggalkan desa dan mengalahkan prajurit kerajaan, perjalanan membawa mereka ke hutan lebat yang penuh dengan hal tak masuk akal."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "prolog",
    "[Narator] Hal tersebut mengatakan bahwa terdapat sebuah item surgawi tersembunyi yang dapat digunakan untuk membangkitkan orang yang telah mati."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "prolog",
    "[Narator] Namun tidak pernah ada satupun orang yang berhasil mendapatkannya, melainkan mereka menghilang tanpa jejak dan tidak pernah kembali."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "prolog",
    "[Narator] Namun, Mereka mengabaikan rumor tersebut. Mereka akhirnya berada di sebuah bangunan tua dan berspekulasi bahwa item surgawi tersebut berada di dalamnya."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "prolog",
    "[Narator] Seseorang dengan aura membunuh, berdiri tepat di atas bangunan tersebut dan langsung menyerang Ananta."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "prolog",
    "[Narator] Pertempuran tidak dapat dihindari, yang pada akhirnya membuat mereka bertiga harus membentuk strategi dalam mengalahkan orang tak dikenal tersebut."
    );

    // Input Dialog pada Act 2.1
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act1",
    "Wadis & Khair : 'ANANTA!!!, Kamu tidak apa apa?'"
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act1",
    "[Narator] Ananta sempat jatuh dan kehilangan kesadaran ketika sebuah cahaya dan kabut yang keluar dari tubuh orang tersebut mendekati mendekati dirinya."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act1",
    "Ananta : 'HAAAAAA!!!'. Ananta terdengar terengah engah ketika sadar."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act1",
    "[Narator] Wadis dan Khair pun menjadi sedikit tenang dari kekhawatirannya tersebut, karena Ananta terlihat baik-baik saja."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act1",
    "[Narator] Namun, Wadis menaruh curiga yang sangat mendalam ketika melihat jasad manusia yang hendak membunuh mereka bertiga ternyata merupakan teman kampungnya yaitu Fakhroni."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act1",
    "[Narator] Tanpa memperdulikan kejadian tersebut mereka bertiga tetap melanjutkan perjalanan menembus hutan luas tersebut, dan akhirnya mereka sampai pada sebuah portal."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act1",
    "[Narator] Mereka masuk ke dalam portal dan berjalan hingga sampai di suatu tempat yang terlihat tidak seperti bumi."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act1",
    "[Narator] Sampai suatu ketika satu serangan yang sangat cepat datang menhampiri mereka dan melukai Wadis."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act1",
    "Wadis : 'ITU XENOMORPH!!!, HATI HATI DENGAN SERANGANNYA!'"
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act1",
    "[Narator] Mereka dipaksa bertempur lagi."
    );

    // Input Dialog pada Act 2.2
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act1",
    "[Narator] Mereka bertiga terluka parah setelah dikalahkan oleh manusia tidak dikenal tersebut dan berhasil melarikan diri ke alam monster."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act1",
    "[Narator] Di alam ini mereka dipertemukan oleh monster Carberus yang merupakan monster penjaga gerbang menuju alam dewa."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act1",
    "[Narator] Mereka harus mengalahkan Carberus walau hidup atau mati! demi keberlangsungan hidup manusia"
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act1",
    "Khair : 'Sepertinya Carberus tidak memiliki nafsu membunuh, namun kita harus berhati hati jika suatu ketika Carberus berubah menjadi murka'"
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act1",
    "[Narator] Mereka pun lansung melontarkan serangan kepada Carberus dan pertempuran tak dapat dihindari!."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act1",
    "[Narator] Mereka pun lansung melontarkan serangan kepada Carberus dan pertempuran tak dapat dihindari!."
    );

    // Input Dialog pada Act 3.1
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "2.1",
    "[Narator] Mengalahkan Xenomorph bukanlah hal yang mudah, karena mereka harus kehilangan banyak darah dan energi mereka."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "2.1",
    "[Narator] Ananta, Wadis dan Khair menyempatkan diri mereka untuk beristirahat sejenak untuk memulihkan tenaga mereka sembari berbincang rencana selanjutnya."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "2.1",
    "[Narator] Mereka beranjak dan terus menelusuri alam monster, hingga mereka sampai disebuah portal yang menghubungi dunia monster dengan dunia para roh."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "2.1",
    "[Narator] Tanpa pikir panjang mereka pun langsung menyusuri portal tersebut hingga sampai di suatu tempat yang benar benar datar, suasana di tempat itu benar benar membuat jiwa benar benar termenung."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "2.1",
    "[Narator] Di kala suasana yang hening tersebut tiba tiba Ananta jatuh dan mengalami kejang kejang."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "2.1",
    "Wadis : 'ANANTA?! Kamu kenapa lagi?'"
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "2.1",
    "[Narator] Tiba tiba ananta menyerang mereka berdua, terlihat sifat Ananta ini sama dengan Fakhroni. Sehingga Wadis mengerti apa yang sebenarnya terjadi."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "2.1",
    "[Narator] Mereka saat ini sedang melawan Roh Umbra yang dikenal akan kekuatannya merasuki tubuh manusia! Mereka berdua harus mengalahkan Ananta yang sedang dirasuki kekuatan super dahsyat."
    );


    // Start
    ceritaUtama.nextAct();
    // End

  }
}