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
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("act3"), "kiri", "act2.1");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("act4.1"), "kiri", "act3");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("act4.2"), "kanan", "act3");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("end1"), "kiri", "act4.1");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("end2"), "kanan", "act4.1");

    // Input Ke Kanan
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("end3"), "kanan", "act3");  
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("end4"), "kanan", "act2.1");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("end7"), "kanan", "act2.2");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("act4.2"), "kiri", "act2.2");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("end5"), "kiri", "act4.2");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("end6"), "kanan", "act4.2");

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

    // Input Dialog pada Act 3
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act2.1",
    "[Narator] Mengalahkan Xenomorph bukanlah hal yang mudah, karena mereka harus kehilangan banyak darah dan energi mereka."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act2.1",
    "[Narator] Ananta, Wadis dan Khair menyempatkan diri mereka untuk beristirahat sejenak untuk memulihkan tenaga mereka sembari berbincang rencana selanjutnya."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act2.1",
    "[Narator] Mereka beranjak dan terus menelusuri alam monster, hingga mereka sampai disebuah portal yang menghubungi dunia monster dengan dunia para roh."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act2.1",
    "[Narator] Tanpa pikir panjang mereka pun langsung menyusuri portal tersebut hingga sampai di suatu tempat yang benar benar datar, suasana di tempat itu benar benar membuat jiwa benar benar termenung."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act2.1",
    "[Narator] Di kala suasana yang hening tersebut tiba tiba Ananta jatuh dan mengalami kejang kejang."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act2.1",
    "Wadis : 'ANANTA?! Kamu kenapa lagi?'"
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act2.1",
    "[Narator] Tiba tiba ananta menyerang mereka berdua, terlihat sifat Ananta ini sama dengan Fakhroni. Sehingga Wadis mengerti apa yang sebenarnya terjadi."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act2.1",
    "[Narator] Mereka saat ini sedang melawan Roh Umbra yang dikenal akan kekuatannya merasuki tubuh manusia! Mereka berdua harus mengalahkan Ananta yang sedang dirasuki kekuatan super dahsyat."
    );

    // Input Dialog pada End 4
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act2.1",
    "[Narator] Xenomorph melancarkan serangan terakhir, menghancurkan mereka bertiga. Dunia di sekitar mereka berubah menjadi gelap. Mereka kalah, dan portal di belakang mereka tertutup, meninggalkan kehampaan yang abadi."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act2.1",
    "[Narator] Dengan kematian mereka, tidak ada lagi yang mampu menghentikan kehancuran yang melanda dunia Altheir. Alam dewa tetap diam, tak ada pertolongan yang datang."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act2.1",
    "[Narator] Xenomorph, makhluk penjaga portal, tetap tak terkalahkan, dan dunia manusia perlahan tenggelam dalam bayang-bayang kehancuran."
    );
    
    // Input Dialog pada Act4.1
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act3",
    "[Narator] Ananta yang dirasuki oleh roh Umbra kini telah dikalahkan ketika Umbra keluar dari tubuh Ananta."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act3",
    "[Narator] Kini Ananta telah terbebas dari ikatan roh Umbra."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act3",
    "[Narator] Sesuatu yang aneh terjadi ketika Umbra yang merupakan roh satu satunya yang ada di alam Roh menghilang adalah, mereka tiba tiba berada di alam Dewa."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act3",
    "[Narator] Tak butuh waktu lama dalam 1 kedipan mata mereka tiba di kerajaan para Dewa. Di kerjaan tersebut terdapat dewa dewa berkumpul untuk menyaksikan pertempuran antara Ananta, Wadis dan Khair melawan Dewa Ares yang di kenal kejam. Ternyata selama ini para Dewa sepakat akan menghancurkan dunia Altheir atas pendapat Dewa Ares dan setuju jika manusia dapat mengalahkan Ares, Altheir akan damai dijanjikannya..."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act3",
    "Ananta : 'Yang maha kuat, Ares kami akan mengalahkanmu! Kami tidak akan tinggal diam ketika manusia terancam musnah'"
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act3",
    "Ares : 'Enyahlah kalian dasar sampah, kalian tidak berhak menginjakkan kaki di alam dewa yang suci ini'"
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act3",
    "[Narator] Entah secepat apa waktu berjalan, tombak perkasa milik Ares tiba tiba menancap dan membunuh Wadis."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act3",
    "[Narator] Ananta dan Khair ketakutan hampir mati melihat Wadis terkapar tak bernyawa akibat tombak Ares menancap di dada Wadis. Khair mengingat bahwa mereka mendapatkan item surgawi yang dapat membangkitkan orang yang telah mati."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act3",
    "[Narator] Dengan sigap Khair menggunakan item tersebut untuk membangkitkan Wadis. Namun, hal yang tak disangka sangka adalah, item tersebut ternyata tidak hanya membangkitkan orang yang telah meninggal tetapi memberikan darah, energi dan kekuatan tak terbatas layaknya dewa."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act3",
    "[Narator] Wadis terbangun dan langsung menyerang Ares tanpa pikir panjang, pertempuran dua gladiator tersebut tak dapat dihindari. Namun Wadis tidaklah sekuat Ares..."
    );

    // Input Dialog pada End 3
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act3",
    "[Narator] Umbra semakin menguasai tubuh Ananta, setiap serangan yang dilancarkan Wadis dan Khair hanya memantul sia-sia. Energi mereka perlahan habis, dan keputusasaan mulai merayap di hati mereka."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act3",
    "[Narator] Namun, serangan terakhir mereka gagal. Umbra memanipulasi tubuh Ananta untuk meluncurkan gelombang energi hitam yang menghantam Wadis dan Khair, membuat mereka terpental jauh."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act3",
    "[Narator] Dengan nafas yang berat, Khair berusaha bangkit, tetapi tubuhnya sudah terlalu lemah."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act3",
    "Khair: 'Maafkan aku, Ananta... kita tidak bisa menyelamatkanmu...'"
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act3",
    "[Narator] Dalam detik-detik terakhir, Wadis dan Khair menghilang dalam kegelapan yang melahap segalanya. Umbra sepenuhnya mengambil alih tubuh Ananta, menjadikannya alat kehancuran."
    );
    
    // Input Dialog pada Act 4.2
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act2.2",
    "[Narator] Carberus kalah telak di tangan mereka bertiga, dan mereka mendapatkan item kebahagiaan yang dapat digunakan untuk menjadi perisai untuk dunia Altheir dari segala bentuk bencana."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act2.2",
    "[Narator] Mereka menyadari bahwa muncul sebuah portal secara tiba tiba didepan mata mereka yang menghantarkan mereka menuju alam Dewa."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act2.2",
    "[Narator] Alam Dewa itu sendiri merupakan alam terindah yang pernah ada, namun entah bagaimana kematian monster Carberus membuka portal alam dewa."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act2.2",
    "Ananta : 'Sepertinya alam roh tidak akan pernah dapat kita capai teman-teman'"
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act2.2",
    "[Narator] Seruan tersebut membuat mereka lega, karena tidak perlu bersusah payah untuk mengalahkan roh satupun untuk dapat membawa mereka ke alam Dewa."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act2.2",
    "[Narator] Ketika sampai di alam Dewa, mereka di hampiri oleh seorang dewa bernama Moros yang dikenal sebagai dewa hampa, dan merupakan dewa yang dapat menentukan takdir hidup manusia."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act2.2",
    "[Narator] Mereka harus mengalahkannya!"
    );

    // Input Dialog pada End7
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act2.2",
    "[Narator] Namun, meskipun ia mencoba keras, kekuatan Carberus terlalu besar. Dengan satu gerakan hebat, Carberus menghancurkan pertahanan terakhir mereka, menyerang Ananta dengan cakar tajamnya. Tubuh Ananta terhantam keras, dan sebelum ia kehilangan kesadaran, ia hanya bisa memikirkan dunia yang akan hancur tanpa bantuan mereka."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act2.2",
    "[Narator] Dalam kekalahan yang pahit, mereka bertiga terkapar di hadapan Carberus. Dunia manusia dan Altheir kini berada dalam bayang-bayang kehancuran yang tak bisa dihindari. Carberus berdiri tegak di atas tubuh mereka, sebagai penjaga yang tak tertandingi, melindungi gerbang menuju alam dewa."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act2.2",
    "[Narator] Ketika dunia mereka terkubur dalam kegelapan, harapan pun hilang begitu saja. Dan alam dewa tetap menghancurkan umat manusia."
    );

    // Input Dialog pada End1
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act4.1",
    "Ares: 'Kalian manusia... hanya sampah... bagaimana bisa...?'"
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act4.1",
    "[Narator] Para Dewa yang menyaksikan terdiam dalam keheningan. Zeus, sang pemimpin para Dewa, akhirnya melangkah maju."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act4.1",
    "Zeus: 'Kalian telah membuktikan bahwa manusia layak untuk melanjutkan hidup di Altheir. Ares, kau telah melampaui batasmu. Hukuman untuk kesombonganmu akan segera dijatuhkan.'"
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act4.1",
    "[Narator] Dengan kekalahan Ares, para Dewa menarik kembali keputusan mereka untuk menghancurkan Altheir. Dunia kembali damai, dan Wadis, Ananta, serta Khair dikenang sebagai legenda yang menyelamatkan umat manusia dari kehancuran."
    );

    // Input Dialog pada End2
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act4.1",
    "Khair: 'Tidak... ini belum berakhir... Kita tidak bisa menyerah!'"
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act4.1",
    "Ananta: 'Khair, kita sudah melakukan yang terbaik...'"
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act4.1",
    "[Narator] Ares berdiri di atas tubuh mereka yang terluka, menatap dengan dingin ke arah mereka."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act4.1",
    "Ares: 'Kalian sudah membuang waktuku. Kini aku akan menyelesaikan apa yang seharusnya kulakukan sejak awal.'"
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act4.1",
    "[Narator] Fakhroni, seorang pembunuh keji, berdiri di tengah jalan, matanya memancarkan kebencian."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act4.1",
    "[Narator] Dalam kilatan cahaya, Ares mengayunkan tombaknya, mengakhiri perlawanan terakhir. Para Dewa menyaksikan dengan ekspresi kosong, dan Altheir, dunia manusia, dihancurkan oleh kehendak para Dewa."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act4.1",
    "[Narator] Namun, sebelum semuanya berakhir, sebuah suara lembut menggema di udara, seolah waktu berhenti. Itu adalah suara Umbra, roh yang sebelumnya terkurung di dalam tubuh Ananta."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act4.1",
    "Umbra: 'Meskipun dunia ini hancur, harapan tidak akan pernah padam. Kejatuhan kalian hari ini hanyalah awal dari kebangkitan manusia esok hari...'"
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act4.1",
    "[Narator] Meski kalah, legenda tentang Ananta, Wadis, dan Khair tetap hidup, memberikan harapan bagi manusia yang tersisa untuk terus melawan kehendak para Dewa di masa depan."
    );

    // Input Dialog pada End5
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act4.2",
    "[Narator] Dengan usaha yang luar biasa dan kerja sama yang solid, mereka berhasil mengalahkan Dewa Moros. Namun, meskipun Moros kalah, nasib dunia Altheir tidak berubah. Kehancuran yang direncanakan oleh Dewa Ares tetap menunggu."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act4.2",
    "[Narator] Mereka menggunakan item perisai Kebahagiaan yang mereka dapatkan untuk melindungi dunia Altheir. Perisai ini tidak melindungi mereka bertiga, tetapi seluruh dunia Altheir dari serangan Dewa-Dewa lainnya."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act4.2",
    "[Narator] Dengan kekuatan item Kebahagiaan, mereka menempatkannya di pusat dunia Altheir, menciptakan perisai yang melindungi dunia ini dari serangan Dewa-Dewa, termasuk Dewa Ares, untuk waktu yang terbatas."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kiri", "act4.2",
    "[Narator] Meskipun dunia Altheir terlindungi untuk sementara waktu, ancaman dari Dewa Ares dan kehancuran yang lebih besar masih menunggu. Namun, berkat keberanian dan pengorbanan mereka, dunia ini mendapatkan kesempatan untuk melawan takdir yang seharusnya tak dapat diubah."
    );

    // Input Dialog pada End6
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act4.2",
    "[Narator] Dan dengan serangan Dewa Moros membuat Ananta, Wadis, dan Khair jatuh ke tanah, tubuh mereka tak bergerak, dan dunia Altheir kehilangan tiga pahlawan terakhirnya. Tak ada lagi harapan untuk dunia yang telah mereka perjuangkan, dan takdir yang ditentukan oleh Dewa Moros akhirnya menjadi kenyataan."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act4.2",
    "[Narator] Dunia Altheir kini berada di ambang kehancuran. Meskipun perjuangan mereka tidak pernah sia-sia, kenyataan yang keras mengungkapkan bahwa takdir para dewa lebih kuat daripada segalanya."
    );
    ceritaUtama.PreOrderInputDialog(ceritaUtama.root, "kanan", "act4.2",
    "[Narator] Namun, moros masih memiliki hati yang baik, di mana mereka bertiga dihidupkan kembali sebagai reinkarnasi manusia kembali."
    );

    // Player 1
    ceritaUtama.player1.addItem("Small Health Potion", "health", 20, false); // Item sekali pakai
    ceritaUtama.player1.addItem("Large Health Potion", "health", 50, false); // Item sekali pakai
    ceritaUtama.player1.addItem("Energy Drink", "energy", 15, false); // Item sekali pakai
    ceritaUtama.player1.addItem("Excalibur Sword", "weapon", 50, true); // Senjata permanen

    // Player 2
    ceritaUtama.player2.addItem("Power Elixir", "power", 60, false);
    ceritaUtama.player2.addItem("Health Regeneration Scroll", "health", 30, false);
    ceritaUtama.player2.addItem("Darkblade", "weapon", 70, true); // Senjata permanen

    // Player 3
    ceritaUtama.player3.addItem("Small Health Potion", "health", 20, false);
    ceritaUtama.player3.addItem("Large Health Potion", "health", 50, false);
    ceritaUtama.player3.addItem("Energy Drink", "energy", 15, false);
    ceritaUtama.player3.addItem("Holy Staff", "weapon", 60, true); // Senjata permanen

    // Start
    ceritaUtama.nextAct();
    // End

  }
}