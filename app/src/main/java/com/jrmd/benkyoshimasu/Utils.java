package com.jrmd.benkyoshimasu;

import android.content.Context;
import android.util.DisplayMetrics;

import com.jrmd.benkyoshimasu.object.Kanji;
import com.jrmd.benkyoshimasu.object.LessonsKanjis;
import com.jrmd.benkyoshimasu.object.LessonsWords;
import com.jrmd.benkyoshimasu.object.Reading;
import com.jrmd.benkyoshimasu.object.Word;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by julian on 07/11/2016.
 */

public class Utils {

    public static LessonsWords loadAllWords(){
        LessonsWords lessons = new LessonsWords();
        List<Word> words1 = new ArrayList<Word>();
        List<Word> words2 = new ArrayList<Word>();
        List<Word> words3 = new ArrayList<Word>();
        List<Word> words4 = new ArrayList<Word>();
        List<Word> words5 = new ArrayList<Word>();
        List<Word> words6 = new ArrayList<Word>();
        List<Word> words7 = new ArrayList<Word>();
        List<Word> words8 = new ArrayList<Word>();
        List<Word> words9 = new ArrayList<Word>();
        words1.add(new Word("Maestro/Profesor","せんせい","先生",1));
        words1.add(new Word("Maestro/Profesor","きょうし","",1));
        words1.add(new Word("Estudíante","がくせい","学生",1));
        words1.add(new Word("Empleado de empresa","かいしゃいん","",1));
        words1.add(new Word("Médico","いしゃ","",1));
        words1.add(new Word("Investigador","けんきゅうしゃ","",1));
        words1.add(new Word("Ingeniero","エンジニア","",1));
        words1.add(new Word("Universidad","だいがく","大学",1));
        words1.add(new Word("Hospital","びょういん","",1));
        words2.add(new Word("Libro","ほん","本",2));
        words2.add(new Word("Diccionario","じしょ","",2));
        words2.add(new Word("Revista","ざっし","",2));
        words2.add(new Word("Periodico","しんぶん","",2));
        words2.add(new Word("Cuaderno","ノート","",2));
        words2.add(new Word("Agenda","てちょう","",2));
        words2.add(new Word("Tarjeta de Negocio","めいし","",2));
        words2.add(new Word("Tarjeta","カード","",2));
        words2.add(new Word("Tarjeta de teléfono","テレホンカード","",2));
        words2.add(new Word("Lápiz","えんぴつ","",2));
        words2.add(new Word("Esfero","ボールペン","",2));
        words2.add(new Word("Portaminas","シャープペンシル","",2));
        words2.add(new Word("Llave","かぎ","",2));
        words2.add(new Word("Reloj","とけい","",2));
        words2.add(new Word("Sombrilla","かさ","",2));
        words2.add(new Word("Maleta","かばん","",2));
        words2.add(new Word("Cinta/Cassette","テープ。カセット","",2));
        words2.add(new Word("Grabadora","テープレコーダー","",2));
        words2.add(new Word("Televisión","テレビ","",2));
        words2.add(new Word("Radio","ラジオ","",2));
        words2.add(new Word("Cámara","カメラ","",2));
        words2.add(new Word("Computador","コンピューター","",2));
        words2.add(new Word("Automóvil","じどうしゃ","自動車",2));
        words2.add(new Word("Escritorio","つくえ","",2));
        words2.add(new Word("Silla","いす","",2));
        words2.add(new Word("Chocolate","チョコレート","",2));
        words2.add(new Word("Café","コーヒー","",2));
        words3.add(new Word("Salón de clase","きょうしつ","",3));
        words3.add(new Word("Comedor","しょくど","",3));
        words3.add(new Word("Oficina","じむしょ","",3));
        words3.add(new Word("Sala de reuniones","かいぎしつ","",3));
        words3.add(new Word("Recepción","うけつけ","",3));
        words3.add(new Word("Lóbi/Vestíbulo","ロビー","",3));
        words3.add(new Word("Habitación","へや","",3));
        words3.add(new Word("Baño","トイレ","",3));
        words3.add(new Word("Baño","おてあらい","",3));
        words3.add(new Word("Escalera","かいだん","",3));
        words3.add(new Word("Ascensor","エレベーター","",3));
        words3.add(new Word("Escalera Electrica","エスカレーター","",3));
        words3.add(new Word("Empresa","かいしゃ","",3));
        words3.add(new Word("Casa","うち","",3));
        words3.add(new Word("Teléfono","でんわ","",3));
        words3.add(new Word("Zapatos","くつ","",3));
        words3.add(new Word("Corbata","ネクタイ","",3));
        words3.add(new Word("Vino","ワイン","",3));
        words3.add(new Word("Tabaco","たばこ","",3));
        words3.add(new Word("Sección(almacenes)","うりば","",3));
        words3.add(new Word("Sótano","ちか","",3));
        words3.add(new Word("- Piso","かい","",3));
        words3.add(new Word("- Yen","えん","",3));
        words3.add(new Word("Cien","ひゃく","百",3));
        words3.add(new Word("Mil","せん","千",3));
        words3.add(new Word("Diez Mil","まん","万",3));
        words4.add(new Word("Levantarse","おきます","",4));
        words4.add(new Word("Acostarse","ねます","",4));
        words4.add(new Word("Trabajar","はたらきます","",4));
        words4.add(new Word("Descansar","やすみます","",4));
        words4.add(new Word("Estudíar","べんきょします","",4));
        words4.add(new Word("Terminar","おわります","",4));
        words4.add(new Word("Supermercado","デパート","",4));
        words4.add(new Word("Banco","ぎんこう","",4));
        words4.add(new Word("Oficina de correos","ゆうびんきょく","",4));
        words4.add(new Word("Biblioteca","としょかん","",4));
        words4.add(new Word("Museo de arte","びじゅつかん","",4));
        words4.add(new Word("Ahora","いま","今",4));
        words4.add(new Word("De la mañana","ごぜん","",4));
        words4.add(new Word("De la tarde","ごご","",4));
        words4.add(new Word("La mañana","あさ","",4));
        words4.add(new Word("Mediodía","ひる","",4));
        words4.add(new Word("Noche","ばん","",4));
        words4.add(new Word("Anteayer","おととい","",4));
        words4.add(new Word("Ayer","きのう","",4));
        words4.add(new Word("Hoy","きょう","",4));
        words4.add(new Word("Mañana","あした","",4));
        words4.add(new Word("Pasado Mañana","あさって","",4));
        words4.add(new Word("Esta mañana","けさ","",4));
        words4.add(new Word("Esta noche","こんばん","",4));
        words4.add(new Word("Descanso/día libre","やすみ","",4));
        words4.add(new Word("Descanso de mediodía","ひるやすみ","",4));
        words4.add(new Word("Todas las mañanas","まいあさ","",4));
        words4.add(new Word("Todas las noches","まいばｎ","",4));
        words4.add(new Word("Todos los días","まいにち","",4));
        words4.add(new Word("Lunes","げつようび","月曜日",4));
        words4.add(new Word("Martes","かようび","火曜日",4));
        words4.add(new Word("Miercoles","すいようび","水曜日",4));
        words4.add(new Word("Jueves","もくようび","木曜日",4));
        words4.add(new Word("Viernes","きんようび","金曜日",4));
        words4.add(new Word("Sabado","どようび","土曜日",4));
        words4.add(new Word("Domingo","にちようび","日曜日",4));
        words4.add(new Word("Número","ばんごう","",4));
        words4.add(new Word("Qué Número","なんばん","",4));
        words4.add(new Word("Desde -"," - から","",4));
        words4.add(new Word("Hasta -"," - まで","",4));

        words5.add(new Word("Ir","いきます","",5));
        words5.add(new Word("Venir","きます","",5));
        words5.add(new Word("Volver","かえります","",5));
        words5.add(new Word("Escuela","がっこう","",5));
        words5.add(new Word("Estación de tren","えき","",5));
        words5.add(new Word("Avión","ひこうき","",5));
        words5.add(new Word("Barco","ふね","",5));
        words5.add(new Word("Tren eléctrico","でんしゃ","",5));
        words5.add(new Word("Metro","ちかてつ","",5));
        words5.add(new Word("Tren bala","しんかんせん","",5));
        words5.add(new Word("Bus","バス","",5));
        words5.add(new Word("Taxi","タクシー","",5));
        words5.add(new Word("Bicicleta","してんしゃ","",5));
        words5.add(new Word("A pie","あるいて","",5));
        words5.add(new Word("Persona","ひと","人",5));
        words5.add(new Word("Amigo/a(s)","ともだち","",5));
        words5.add(new Word("Novio","かれ","",5));
        words5.add(new Word("Novia","かのじょ","",5));
        words5.add(new Word("Familia","かぞく","",5));
        words5.add(new Word("Solo/a","ひとりで","",5));
        words5.add(new Word("La semana pasada","せんしゅう","",5));
        words5.add(new Word("Esta Semana","こんしゅう","",5));
        words5.add(new Word("La próxima semana","らいしゅう","",5));
        words5.add(new Word("El mes pasado","せんげつ","先月",5));
        words5.add(new Word("Este mes","こんげつ","",5));
        words5.add(new Word("El próximo mes","らいげつ","",5));
        words5.add(new Word("El año pasado","きょねん","",5));
        words5.add(new Word("Este año","ことし","",5));
        words5.add(new Word("El proximo año","らいねん","",5));
        words5.add(new Word("Primer día del mes","ついたち","１日",5));
        words5.add(new Word("2do día del mes","ふっか","２日",5));
        words5.add(new Word("3er día del mes","みっか","３日",5));
        words5.add(new Word("4to día del mes","よっか","４日",5));
        words5.add(new Word("5to día del mes","いつか","５日",5));
        words5.add(new Word("6to día del mes","むいか","６日",5));
        words5.add(new Word("7to día del mes","なのか","７日",5));
        words5.add(new Word("8to día del mes","ようか","８日",5));
        words5.add(new Word("9to día del mes","ここのか","９日",5));
        words5.add(new Word("10mo día del mes","とおか","１０日",5));
        words5.add(new Word("14vo día del mes","じゅうよっか","１４日",5));
        words5.add(new Word("20vo día del mes","はつか","２０日",5));
        words5.add(new Word("24vo día del mes","にじゅうよっか","２４日",5));
        words5.add(new Word("Cúando","いつ","",5));
        words5.add(new Word("Cumpleaños","たんじょうび","",5));
        words6.add(new Word("Comer","たべます","",6));
        words6.add(new Word("Beber/Tomar","のみます","",6));
        words6.add(new Word("Fumar","すいます","",6));
        words6.add(new Word("Ver/Mirar","みます","",6));
        words6.add(new Word("Oír/Escuchar","ききまし","",6));
        words6.add(new Word("Leer","よみます","",6));
        words6.add(new Word("Escribir/Diibujar","かきます","",6));
        words6.add(new Word("Comprar","かいます","",6));
        words6.add(new Word("Tomar fotos","よります","",6));
        words6.add(new Word("Hacer","します","",6));
        words6.add(new Word("Encontrarse con","あいます","",6));
        words6.add(new Word("Comida/Arroz cocido","ごはん","",6));
        words6.add(new Word("Desayuno","あさごはん","",6));
        words6.add(new Word("Almuerzo","ひるごはん","",6));
        words6.add(new Word("Cena","ばんごはん","",6));
        words6.add(new Word("Pan","パン","",6));
        words6.add(new Word("Huevo","たまご","",6));
        words6.add(new Word("Carne de ganado","にく","",6));
        words6.add(new Word("Pescado","さかな","",6));
        words6.add(new Word("Verduras","やさい","",6));
        words6.add(new Word("Frutas","くだもの","",6));
        words6.add(new Word("Agua","みず","",6));
        words6.add(new Word("Té","おちゃ","",6));
        words6.add(new Word("Té negro","のうちゃ","",6));
        words6.add(new Word("Leche","ぎゅうにゅう","",6));
        words6.add(new Word("Leche","ミルク","",6));
        words6.add(new Word("Jugo","ジュース","",6));
        words6.add(new Word("Cerveza","ビール","",6));
        words6.add(new Word("Sake","さけ","",6));
        words6.add(new Word("Video cinta","ビデオ","",6));
        words6.add(new Word("Película","えうが","",6));
        words6.add(new Word("Carta","てがみ","",6));
        words6.add(new Word("Informe","レポート","",6));
        words6.add(new Word("Fotografía","しゃしん","",6));
        words6.add(new Word("Tienda","みせ","",6));
        words6.add(new Word("Restaurante","レストラン","",6));
        words6.add(new Word("Jardin","にわ","",6));
        words6.add(new Word("Tarea","しゅくだい","",6));
        words6.add(new Word("Ténis","テニス","",6));
        words6.add(new Word("Fútbol","サッカー","",6));
        words6.add(new Word("Pepino","きゅうり","",6));
        words6.add(new Word("Tomate","トマト","",6));
        words6.add(new Word("Berenjena","なす","",6));
        words6.add(new Word("Frijoles","まめ","",6));
        words6.add(new Word("Repollo","キャベツ","",6));
        words6.add(new Word("Cebolla Verde","ねぎ","",6));
        words6.add(new Word("Col chino","はくさい","",6));
        words6.add(new Word("Espinaca","ほうれんそう","",6));
        words6.add(new Word("Lechuga","レタス","",6));
        words6.add(new Word("Papas","じゃがいも","",6));
        words6.add(new Word("Nabo japones","だいこん","",6));
        words6.add(new Word("Cebolla","たまねぎ","",6));
        words6.add(new Word("Zanahoria","にんじん","",6));
        words6.add(new Word("Fresas","いちご","",6));
        words6.add(new Word("Durazno","もも","",6));
        words6.add(new Word("Sandia","すいか","",6));
        words6.add(new Word("Uvas","ぶどう","",6));
        words6.add(new Word("Pera japonesa","なし","",6));
        words6.add(new Word("Naranja mandarina","みかん","",6));
        words6.add(new Word("Manzana","りんご","",6));
        words6.add(new Word("Platano","バナナ","",6));
        words6.add(new Word("Carne vaca","ぎゅうにく","",6));
        words6.add(new Word("Pollo","とりにく","",6));
        words6.add(new Word("Cerdo","ぶたにく","",6));
        words6.add(new Word("Salchicha","ソーセージ","",6));
        words6.add(new Word("Jamon","ハム","",6));
        words6.add(new Word("Sardina","いわし","",6));
        words6.add(new Word("Salmon","さけ","",6));
        words6.add(new Word("Atun","まぐろ","",6));
        words6.add(new Word("Camaron","えび","",6));
        words6.add(new Word("Cangrejo","かに","",6));
        words6.add(new Word("Calamar","いか","",6));
        words6.add(new Word("Pulpo","たこ","",6));

        words7.add(new Word("Cortar","きります","切ります",7));
        words7.add(new Word("Enviar","おくります","送ります",7));
        words7.add(new Word("Regalar","あげます","",7));
        words7.add(new Word("Recibir","もらいます","",7));
        words7.add(new Word("Prestar ","かします","貸します",7));
        words7.add(new Word("Pedir prestado","かります","借ります",7));
        words7.add(new Word("Enseñar","おしえます","教えます",7));
        words7.add(new Word("Aprender","ならいます","ならいます",7));
        words7.add(new Word("Hacer llamada","かけます","",7));
        words7.add(new Word("Mano","て","",7));
        words7.add(new Word("Palillos","はし","",7));
        words7.add(new Word("Cuchara","スプーン","",7));
        words7.add(new Word("Cuchillo","ナイフ","",7));
        words7.add(new Word("Tenedor","フォク","",7));
        words7.add(new Word("Tijeras ","はさみ","",7));
        words7.add(new Word("Fax","ファクス","",7));
        words7.add(new Word("Procesador de palabras ","ワープロ","",7));
        words7.add(new Word("Computador personal ","パソコン","",7));
        words7.add(new Word("Perforadora","パンチ","",7));
        words7.add(new Word("Cosedora ","ホッチキス","",7));
        words7.add(new Word("Cinta pegante","セローテプ","",7));
        words7.add(new Word("Borrador ","けしゴム","",7));
        words7.add(new Word("Papel ","かみ","",7));
        words7.add(new Word("Flor","はな","花",7));
        words7.add(new Word("Camisa","シャツ","",7));
        words7.add(new Word("Regalo","プレゼント","",7));
        words7.add(new Word("Equipaje ","にもつ","荷物",7));
        words7.add(new Word("Dinero","おかね","お金",7));
        words7.add(new Word("Tiquete ","きっぷ","",7));
        words7.add(new Word("Navidad","クリスマス","",7));
        words7.add(new Word("Papá ","ちち","父",7));
        words7.add(new Word("Mamá ","はは","母",7));
        words7.add(new Word("Su papá ","おとうさん","お父さん",7));
        words7.add(new Word("Su mamá ","おかあさん","お母さん",7));
        words7.add(new Word("Ya","もう","",7));
        words7.add(new Word("Todavía ","まだ","",7));
        words7.add(new Word("Después ","これから","",7));
        words7.add(new Word("Viaje ","りょこう","",7));
        words7.add(new Word("Suvenir ","おみやげ","",7));

        words8.add(new Word("Guapo","ハンサム","",8));
        words8.add(new Word("Hermoso, limpio","きれい","",8));
        words8.add(new Word("Tranquilo ","しずか","静か",8));
        words8.add(new Word("Concurrido, animado","にぎやか","",8));
        words8.add(new Word("Famoso ","ゆうめい","有名",8));
        words8.add(new Word("Amable ","しんせつ","親切",8));
        words8.add(new Word("Sano, con ánimo ","げんき","元気",8));
        words8.add(new Word("Estar libre ","ひま","暇",8));
        words8.add(new Word("Conveniente ","べんり","便利",8));
        words8.add(new Word("Bonito ","すてき","",8));
        words8.add(new Word("Grande","おおきい","大きい",8));
        words8.add(new Word("Pequeño","ちいさい","小さい",8));
        words8.add(new Word("Nuevo","あたらしい","新しい",8));
        words8.add(new Word("Viejo","ふるい","古い",8));
        words8.add(new Word("Bueno ","いい","",8));
        words8.add(new Word("Malo ","わるい","悪い",8));
        words8.add(new Word("Caluroso","あつい","暑い",8));
        words8.add(new Word("Frio (clima) ","さむい","寒い",8));
        words8.add(new Word("Frio (tacto) ","つめたい","冷たい",8));
        words8.add(new Word("Difícil ","むずかしい","難しい",8));
        words8.add(new Word("Fácil ","やさしい","易しい",8));
        words8.add(new Word("Caro, alto","たかい","高い",8));
        words8.add(new Word("Barato ","やすい","安い",8));
        words8.add(new Word("Bajo (estatura) ","ひくい","低い",8));
        words8.add(new Word("Interesante ","おもしろい","",8));
        words8.add(new Word("Delicioso, sabroso ","おいしい","",8));
        words8.add(new Word("Atareado ","いそがしい","忙しい",8));
        words8.add(new Word("Divertido ","たのしい","楽しい",8));
        words8.add(new Word("Blanco","しろい","白い",8));
        words8.add(new Word("Negro","くろい","黒い",8));
        words8.add(new Word("Rojo","あかい","赤い",8));
        words8.add(new Word("Azul","あおい","青い",8));
        words8.add(new Word("Flor de cerezo ","さくら","",8));
        words8.add(new Word("Población ","まち","町",8));
        words8.add(new Word("Comida","たべもの","食べ物",8));
        words8.add(new Word("Lugar","どこる","",8));
        words8.add(new Word("Residencia ","りょう","寮",8));
        words8.add(new Word("Visa diaria ","せいかつ","生活",8));
        words8.add(new Word("Cómo ","どう","",8));
        words8.add(new Word("Que clase de ~","どんな~","",8));
        words8.add(new Word("Cuál ","どれ","",8));
        words8.add(new Word("Mucho","とても","",8));
        words8.add(new Word("No tan ","あまり","",8));
        words8.add(new Word("Y","そして","",8));
        words8.add(new Word("Pero ","~が","",8));


        lessons.setWordsLesson1(words1);
        lessons.setWordsLesson2(words2);
        lessons.setWordsLesson3(words3);
        lessons.setWordsLesson4(words4);
        lessons.setWordsLesson5(words5);
        lessons.setWordsLesson6(words6);
        lessons.setWordsLesson7(words7);
        lessons.setWordsLesson8(words8);
        lessons.setWordsLesson9(words9);



        return lessons;
    }

    public static int dpToPx(Context context, int dp) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int px = Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
        return px;
    }

    public static LessonsKanjis loadAllKanjis() {
        LessonsKanjis lessons= new LessonsKanjis();
        List<Kanji> kanjis1=new ArrayList<Kanji>();
        List<Kanji> kanjis2=new ArrayList<Kanji>();
        List<Kanji> kanjis3=new ArrayList<Kanji>();
        List<Kanji> kanjis4=new ArrayList<Kanji>();
        List<Kanji> kanjis5=new ArrayList<Kanji>();
        List<Kanji> kanjis6=new ArrayList<Kanji>();
        List<Kanji> kanjis7=new ArrayList<Kanji>();
        List<Kanji> kanjis8=new ArrayList<Kanji>();
        List<Kanji> kanjis9=new ArrayList<Kanji>();

        List<Reading> readings = new ArrayList<Reading>();
        readings.add(new Reading("ひ",true));
        readings.add(new Reading("び",true));
        readings.add(new Reading("か",true));
        readings.add(new Reading("ニチ",false));
        readings.add(new Reading("ニ",false));
        kanjis1.add(new Kanji("日","Sol", readings,5));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("つき",true));
        readings.add(new Reading("ゲツ",false));
        kanjis1.add(new Kanji("月","Luna", readings,4));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("き",true));
        readings.add(new Reading("モク",false));
        readings.add(new Reading("ボク",false));
        kanjis1.add(new Kanji("木","Arbol", readings,4));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("やま",true));
        readings.add(new Reading("サン",false));
        readings.add(new Reading("ザン",false));
        kanjis1.add(new Kanji("山","Montaña", readings,3));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("かわ",true));
        readings.add(new Reading("がわ",true));
        readings.add(new Reading("セイ",false));
        kanjis1.add(new Kanji("川","Rio", readings,3));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("た",true));
        readings.add(new Reading("だ",true));
        readings.add(new Reading("デン",false));
        kanjis1.add(new Kanji("田","Arrozal", readings,5));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("ひと",true));
        readings.add(new Reading("ジン",false));
        readings.add(new Reading("ニン",false));
        kanjis1.add(new Kanji("人","Persona", readings,2));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("くち",true));
        readings.add(new Reading("ぐち",true));
        readings.add(new Reading("コウ",false));
        kanjis1.add(new Kanji("口","Boca", readings,3));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("くるま",true));
        readings.add(new Reading("シャ",true));
        kanjis1.add(new Kanji("車","Carro", readings,7));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("かど",true));
        readings.add(new Reading("モン",false));
        kanjis1.add(new Kanji("門","Entrada", readings,8));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("ひ",true));
        readings.add(new Reading("カ",false));
        kanjis2.add(new Kanji("火","Fuego", readings,4));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("みず",true));
        readings.add(new Reading("スイ",false));
        kanjis2.add(new Kanji("水","Agua", readings,4));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("かね",true));
        readings.add(new Reading("キン",false));
        kanjis2.add(new Kanji("金","Oro, Metal", readings,8));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("つち",true));
        readings.add(new Reading("ド",false));
        kanjis2.add(new Kanji("土","Tierra", readings,3));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("こ",true));
        readings.add(new Reading("シ",false));
        kanjis2.add(new Kanji("子","Niño", readings,3));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("おんな",true));
        readings.add(new Reading("ジョ",false));
        kanjis2.add(new Kanji("女","Mujer", readings,3));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("まなぶ",true));
        readings.add(new Reading("ガク",false));
        readings.add(new Reading("ガッー",false));
        kanjis2.add(new Kanji("学","Estudiar", readings,8));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("いきる",true));
        readings.add(new Reading("うまれる",true));
        readings.add(new Reading("セイ",false));
        kanjis2.add(new Kanji("生","Vivir, Nacer", readings,5));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("さき",true));
        readings.add(new Reading("セン",false));
        kanjis2.add(new Kanji("先","Anterior, Antiguo", readings,6));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("わたし",true));
        readings.add(new Reading("わたくし",true));
        readings.add(new Reading("シ",false));
        kanjis2.add(new Kanji("私","Yo, Privado", readings,7));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("ひと",true));
        readings.add(new Reading("イチ",false));
        kanjis3.add(new Kanji("一","Uno", readings,1));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("ふた",true));
        readings.add(new Reading("ニ",false));
        kanjis3.add(new Kanji("二","Dos", readings,2));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("み",true));
        readings.add(new Reading("みっ",true));
        readings.add(new Reading("サン",false));
        kanjis3.add(new Kanji("三","Tres", readings,3));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("よっ",true));
        readings.add(new Reading("よん",true));
        readings.add(new Reading("シ",false));
        kanjis3.add(new Kanji("四","Cuatro", readings,5));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("いつ",true));
        readings.add(new Reading("ゴ",false));
        kanjis3.add(new Kanji("五","Cinco", readings,4));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("む",true));
        readings.add(new Reading("む",true));
        readings.add(new Reading("ロク",false));
        kanjis3.add(new Kanji("六","Seis", readings,4));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("なな",true));
        readings.add(new Reading("シチ",false));
        kanjis3.add(new Kanji("七","Siete", readings,2));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("や",true));
        readings.add(new Reading("やっ",true));
        readings.add(new Reading("ハチ",false));
        kanjis3.add(new Kanji("八","Ocho", readings,2));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("ここの",true));
        readings.add(new Reading("キュウ",false));
        kanjis3.add(new Kanji("九","Nueve", readings,2));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("とお",true));
        readings.add(new Reading("ジュウ",false));
        kanjis3.add(new Kanji("十","Diez", readings,2));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("ヒャク",false));
        readings.add(new Reading("ビャク",false));
        readings.add(new Reading("ピャク",false));
        kanjis3.add(new Kanji("百","Cien", readings,6));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("ち",true));
        readings.add(new Reading("セン",false));
        kanjis3.add(new Kanji("千","Mil", readings,3));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("マン",false));
        readings.add(new Reading("バン",false));
        kanjis3.add(new Kanji("万","Diez Mil", readings,3));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("エン",false));
        kanjis3.add(new Kanji("円","Yen", readings,4));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("とし",false));
        readings.add(new Reading("ネン",false));
        kanjis3.add(new Kanji("年","Año", readings,4));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("うえ",true));
        readings.add(new Reading("ジョウ",false));
        kanjis4.add(new Kanji("上","Arriba", readings,3));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("した",true));
        readings.add(new Reading("カ",false));
        readings.add(new Reading("ゲ",false));
        kanjis4.add(new Kanji("下","Abajo", readings,3));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("なか",true));
        readings.add(new Reading("チュウ",false));
        kanjis4.add(new Kanji("中","Adentro", readings,4));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("おおきい",true));
        readings.add(new Reading("タイ",false));
        readings.add(new Reading("ダイ",false));
        kanjis4.add(new Kanji("大","Grande", readings,3));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("ちいさい",true));
        readings.add(new Reading("こ",true));
        readings.add(new Reading("お",true));
        readings.add(new Reading("ショウ",false));
        kanjis4.add(new Kanji("小","Pequeño", readings,3));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("もと",true));
        readings.add(new Reading("ホン",false));
        kanjis4.add(new Kanji("本","Libro, Origen", readings,5));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("わかる",true));
        readings.add(new Reading("フン",false));
        readings.add(new Reading("ブン",false));
        readings.add(new Reading("プン",false));
        kanjis4.add(new Kanji("分","Dividir, Entender", readings,4));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("なかば",true));
        readings.add(new Reading("リョク",false));
        readings.add(new Reading("リキ",false));
        kanjis4.add(new Kanji("半","Mitad", readings,5));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("ちから",true));
        readings.add(new Reading("カ",false));
        kanjis4.add(new Kanji("力","Fuerzar, Habilidad", readings,2));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("なに",true));
        readings.add(new Reading("なん",true));
        readings.add(new Reading("カ",false));
        kanjis4.add(new Kanji("何","Qué?", readings,7));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("あかるい",true));
        readings.add(new Reading("あける",true));
        readings.add(new Reading("メイ",false));
        kanjis5.add(new Kanji("明","Brillante", readings,8));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("やすみ",true));
        readings.add(new Reading("キュウ",false));
        kanjis5.add(new Kanji("休","Descansar", readings,6));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("からだ",true));
        readings.add(new Reading("タイ",false));
        kanjis5.add(new Kanji("体","Cuerpo", readings,7));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("すきな",true));
        readings.add(new Reading("すく",true));
        readings.add(new Reading("コウ",false));
        kanjis5.add(new Kanji("好","Amor, Gustar", readings,6));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("おとこ",true));
        readings.add(new Reading("ダン",false));
        readings.add(new Reading("ナン",false));
        kanjis5.add(new Kanji("男","Hombre", readings,7));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("はやし",true));
        readings.add(new Reading("リン",false));
        kanjis5.add(new Kanji("林","Madera, Huerto", readings,8));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("もり",true));
        readings.add(new Reading("シン",false));
        kanjis5.add(new Kanji("森","Bosque, Selva", readings,12));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("あいだ",true));
        readings.add(new Reading("ま",true));
        readings.add(new Reading("カン",false));
        kanjis5.add(new Kanji("間","Entre", readings,12));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("はたけ",true));
        readings.add(new Reading("はた",true));
        kanjis5.add(new Kanji("畑","Campo cultivado", readings,9));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("いわ",true));
        readings.add(new Reading("ガン",false));
        kanjis5.add(new Kanji("岩","Roca", readings,8));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("め",true));
        readings.add(new Reading("モク",false));
        kanjis6.add(new Kanji("目","Ojo", readings,5));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("みみ",true));
        readings.add(new Reading("ジ",false));
        kanjis6.add(new Kanji("耳","Oreja", readings,6));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("て",true));
        readings.add(new Reading("シュ",false));
        kanjis6.add(new Kanji("手","Mano", readings,4));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("あし",true));
        readings.add(new Reading("たりる",true));
        readings.add(new Reading("たす",true));
        readings.add(new Reading("ソク",false));
        kanjis6.add(new Kanji("足","Pierna", readings,7));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("あめ",true));
        readings.add(new Reading("ウ",false));
        kanjis6.add(new Kanji("雨","Lluvia", readings,8));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("たけ",true));
        readings.add(new Reading("チク",false));
        kanjis6.add(new Kanji("竹","Bamboo", readings,6));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("こめ",true));
        readings.add(new Reading("マイ",false));
        readings.add(new Reading("ベイ",false));
        kanjis6.add(new Kanji("米","Arroz", readings,6));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("かい",true));
        readings.add(new Reading("バイ",false));
        kanjis6.add(new Kanji("貝","Marisco", readings,7));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("いし",true));
        readings.add(new Reading("セキ",false));
        kanjis6.add(new Kanji("石","Piedra", readings,5));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("いと",true));
        readings.add(new Reading("シ",false));
        kanjis6.add(new Kanji("糸","Hilo", readings,6));
        readings = new ArrayList<Reading>();

        readings.add(new Reading("はな",true));
        readings.add(new Reading("カ",false));
        kanjis7.add(new Kanji("花","Flor", readings,7));
        readings = new ArrayList<Reading>();
        readings.add(new Reading("チャ",false));
        readings.add(new Reading("サ",false));
        kanjis7.add(new Kanji("茶","Té", readings,9));
        readings = new ArrayList<Reading>();
        readings.add(new Reading("ニク ",false));
        kanjis7.add(new Kanji("肉","Carne", readings,6));
        readings = new ArrayList<Reading>();
        readings.add(new Reading("ブン",false));
        readings.add(new Reading("モン",false));
        kanjis7.add(new Kanji("文","Frase", readings,4));
        readings = new ArrayList<Reading>();
        readings.add(new Reading("ジ",false));
        kanjis7.add(new Kanji("字","Caracteres chinos", readings,8));
        readings = new ArrayList<Reading>();
        readings.add(new Reading("もの",true));
        readings.add(new Reading("ブツ",false));
        readings.add(new Reading("モツ",false));
        kanjis7.add(new Kanji("物","Cosa", readings,8));
        readings = new ArrayList<Reading>();
        readings.add(new Reading("うし",true));
        readings.add(new Reading("ギュウ",false));
        kanjis7.add(new Kanji("牛","Vaca", readings,4));
        readings = new ArrayList<Reading>();
        readings.add(new Reading("うま",true));
        readings.add(new Reading("バ",false));
        kanjis7.add(new Kanji("馬","Caballo", readings,10));
        readings = new ArrayList<Reading>();
        readings.add(new Reading("とり",true));
        readings.add(new Reading("チョウ",false));
        kanjis7.add(new Kanji("鳥","Pájaro", readings,11));
        readings = new ArrayList<Reading>();
        readings.add(new Reading("さかな",true));
        readings.add(new Reading("うお",true));
        readings.add(new Reading("ジョ",false));
        kanjis7.add(new Kanji("魚","Pescado", readings,11));
        readings = new ArrayList<Reading>();
        readings.add(new Reading("あたらしい",true));
        readings.add(new Reading("シン",false));
        kanjis8.add(new Kanji("新","Nuevo", readings,13));
        readings = new ArrayList<Reading>();
        readings.add(new Reading("ふるい",true));
        readings.add(new Reading("コ",false));
        kanjis8.add(new Kanji("古","Viejo ", readings,5));
        readings = new ArrayList<Reading>();
        readings.add(new Reading("ながい",true));
        readings.add(new Reading("チョウ",false));
        kanjis8.add(new Kanji("長","Largo", readings,8));
        readings = new ArrayList<Reading>();
        readings.add(new Reading("みじかい",true));
        readings.add(new Reading("タン",false));
        kanjis8.add(new Kanji("短","Corto", readings,12));
        readings = new ArrayList<Reading>();
        readings.add(new Reading("たかい",true));
        readings.add(new Reading("コウ",false));
        kanjis8.add(new Kanji("高","Caro /alto ", readings,10));
        readings = new ArrayList<Reading>();
        readings.add(new Reading("やすい",true));
        readings.add(new Reading("アン",false));
        kanjis8.add(new Kanji("安","Seguro, barato ", readings,6));
        readings = new ArrayList<Reading>();
        readings.add(new Reading("ひくい",true));
        readings.add(new Reading("テイ",false));
        kanjis8.add(new Kanji("低","Bajo", readings,7));
        readings = new ArrayList<Reading>();
        readings.add(new Reading("くらい",true));
        readings.add(new Reading("アン",false));
        kanjis8.add(new Kanji("暗","Oscuro", readings,13));
        readings = new ArrayList<Reading>();
        readings.add(new Reading("おおい",true));
        readings.add(new Reading("タ",false));
        kanjis8.add(new Kanji("多","Mucho ", readings,6));
        readings = new ArrayList<Reading>();
        readings.add(new Reading("すくない",true));
        readings.add(new Reading("すこし",true));
        readings.add(new Reading("ショウ",false));
        kanjis8.add(new Kanji("少","Poco", readings,4));
        readings = new ArrayList<Reading>();

        /*readings.add(new Reading("",true));
        readings.add(new Reading("",true));
        readings.add(new Reading("",false));
        kanjis5.add(new Kanji("","", readings,5));
        readings = new ArrayList<Reading>();*/




        lessons.setKanjisLesson1(kanjis1);
        lessons.setKanjisLesson2(kanjis2);
        lessons.setKanjisLesson3(kanjis3);
        lessons.setKanjisLesson4(kanjis4);
        lessons.setKanjisLesson5(kanjis5);
        lessons.setKanjisLesson6(kanjis6);
        lessons.setKanjisLesson7(kanjis7);
        lessons.setKanjisLesson8(kanjis8);
        lessons.setKanjisLesson9(kanjis9);

        return lessons;

    }


    public static LessonsWords loadAllAdvanceLessonWords(){
        LessonsWords lessons = new LessonsWords();
        List<Word> words1 = new ArrayList<Word>();
        List<Word> words2 = new ArrayList<Word>();
        List<Word> words3 = new ArrayList<Word>();
        List<Word> words4 = new ArrayList<Word>();
        List<Word> words5 = new ArrayList<Word>();
        List<Word> words6 = new ArrayList<Word>();
        List<Word> words7 = new ArrayList<Word>();
        List<Word> words8 = new ArrayList<Word>();
        List<Word> words9 = new ArrayList<Word>();

        words1.add(new Word("Japon","にほん","日本",1));
        words1.add(new Word("Volcan","かざん","火山",1));
        words1.add(new Word("Entrada","いりぐち","入口",1));
        words1.add(new Word("Salida","でぐち","出口",1));
        words1.add(new Word("Poblacion","じんこう","人口",1));
        words1.add(new Word("Tren","でんしゃ","電車",1));
        words1.add(new Word("Automovil","じどうしゃ","自動車",1));
        words1.add(new Word("Especialidad","せんもん","専門",1));

        words2.add(new Word("Campo de arroz","すいでん","水田",2));
        words2.add(new Word("Dinero","おかね","お金",2));
        words2.add(new Word("Ingenieria Civil","どぼく","土木",2));
        words2.add(new Word("Mujer","おんなのひと","女の人",2));
        words2.add(new Word("Universidad","だいがく","大学",2));
        words2.add(new Word("Colegio","がっこう","学校",2));
        words2.add(new Word("Vivir","いきる","生きる",2));
        words2.add(new Word("Nacer","うまれる","生まれる",2));
        words2.add(new Word("Profesor","せんせい","先生",2));
        words2.add(new Word("Estudiante","がくせい","学生",2));
        words2.add(new Word("Mes Anterior","せんげつ","先月",2));
        words2.add(new Word("Privado","しりつ","私立",2));
        words2.add(new Word("Universidad Privada","しりつだいがく","私立大学",2));

        words3.add(new Word("Chiba","ちば","千葉",3));
        words3.add(new Word("Todos los Paises","ぼんこく","万国",3));
        words3.add(new Word("Yen","えん","円",3));
        words3.add(new Word("Persona Mayor","としうえ","年上",3));
        words3.add(new Word("Año Pasado","きょねん","去年",3));
        words3.add(new Word("Proximo Año","らいねん","来年",3));

        words4.add(new Word("Subir","のぼる","上る",4));
        words4.add(new Word("Subir, escalar","あがる","上がる",4));
        words4.add(new Word("Hábil","じょうずな","上手",4));
        words4.add(new Word("Bajar","さがる","下がる",4));
        words4.add(new Word("Persona joven","としした","年下",4));
        words4.add(new Word("Bajarse","げしゃする","下車",4));
        words4.add(new Word("Centro","ちゅうしん","中心",4));
        words4.add(new Word("Todo el dia","いちにちじゅう","一日中",4));
        words4.add(new Word("Grande","おおきい","大きい",4));
        words4.add(new Word("Importante","たいせつな","大切な",4));
        words4.add(new Word("Adulto","おとな","大人",4));
        words4.add(new Word("Pequeño","ちいさい","小さい",4));
        words4.add(new Word("Arroyo","おがわ","小川",4));
        words4.add(new Word("Escuela Primaria","しょうがっこう","小学校",4));
        words4.add(new Word("Niño","こども","小人",4));
        words4.add(new Word("Este dia","ほんじつ","本日",4));
        words4.add(new Word("Oficina principal","ほんてん","本店",4));
        words4.add(new Word("Mitad","はんぶん","半分",4));
        words4.add(new Word("Mitad del Año","はにょし","半年",4));
        words4.add(new Word("Dividir","わける","分ける",4));
        words4.add(new Word("Entender","わかる","分かる",4));
        words4.add(new Word("Poder","ちから","力",4));
        words4.add(new Word("Habilidad","じつりょく","実力",4));
        words4.add(new Word("Dinamica","りきがく","力学",4));
        words4.add(new Word("Cuantas personas?","なんにん","何人",4));
        words4.add(new Word("Que año?","なんねん","何年",4));


        words5.add(new Word("Brillante","あかるい","明るい",5));
        words5.add(new Word("Amanecer","あける","明ける",5));
        words5.add(new Word("Descansar","やすむ","休む",5));
        words5.add(new Word("Descanso","やすみ","休み",5));
        words5.add(new Word("Un Festivo","きゅうじつ","休日",5));
        words5.add(new Word("Fuerza fisica","たいりょく","体力",5));
        words5.add(new Word("Educación Fisica","たいいく","体育",5));
        words5.add(new Word("Favorito","すきな","すきな",5));
        words5.add(new Word("Ser amado","すかれる","好かれる",5));
        words5.add(new Word("Hombre","おとこ","男",5));
        words5.add(new Word("Niño","おとこのこ","男の子",5));
        words5.add(new Word("Niño estudiante","だんしがくせい","男子学生",5));
        words5.add(new Word("Madera","はやし","林",5));
        words5.add(new Word("Forestry","りんぎょう","林業",5));
        words5.add(new Word("Bosque","もり","森",5));
        words5.add(new Word("Madera y bosque","しんりん","森林",5));
        words5.add(new Word("Entre","あいだ","間",5));
        words5.add(new Word("Un año","いちねんかん","一年間",5));
        words5.add(new Word("Ser puntual","まにあう","間に合う",5));
        words5.add(new Word("Tiempo","じかん","時間",5));
        words5.add(new Word("Campo cultivado","はたけ","畑",5));
        words5.add(new Word("Campo de arroz","たはた","田畑",5));
        words5.add(new Word("Montaña rocosa","いわやま","岩山",5));
        words5.add(new Word("Roca","いわ","岩",5));
        words5.add(new Word("Rocas y piedras","がんせき","岩石",5));


        words6.add(new Word("Tabla de contenido","もくじ","目次",6));
        words6.add(new Word("Superior(rango)","めうえ","目上",6));
        words6.add(new Word("Otorrinología","じびか","耳鼻科",6));
        words6.add(new Word("Carta","てがみ","手紙",6));
        words6.add(new Word("Habilidoso, Inteligente","じょうずな","上手な",6));
        words6.add(new Word("No Habilidoso, Torpe","へたな","下手な",6));
        words6.add(new Word("Dos pares","にそく","二足",6));
        words6.add(new Word("Ser suficiente","たりる","足りる",6));
        words6.add(new Word("Lluvia","あめ","雨",6));
        words6.add(new Word("Clima lluvioso","うてん","雨天",6));
        words6.add(new Word("Bambu","たけ","竹",6));
        words6.add(new Word("Brote de bambu","たけのこ","竹の子",6));
        words6.add(new Word("Centro America","ちゅうべい","中米",6));
        words6.add(new Word("America","べいこく","米国",6));
        words6.add(new Word("Concha","かいがら","貝殻",6));
        words6.add(new Word("Petroleo, aceite","せきゆ","石油",6));
        words6.add(new Word("Fosil","かせき","化石",6));
        words6.add(new Word("Hilo de lana","けいと","毛糸",6));

        words7.add(new Word("Flor","はな","花",7));
        words7.add(new Word("Fuegos artificiales","はなび","花火",7));
        words7.add(new Word("Florero","かびん","花びん",7));
        words7.add(new Word("Té","おちゃ","お茶",7));
        words7.add(new Word("Té verde","にほんちゃ","日本茶",7));
        words7.add(new Word("Cafetería","きっさてん","喫茶店",7));
        words7.add(new Word("Té negro","こうちゃ","紅茶",7));
        words7.add(new Word("Carne","にく","肉",7));
        words7.add(new Word("Carne pollo","とりにく","鳥肉",7));
        words7.add(new Word("Carne vaca","ぎゅうにく","牛肉",7));
        words7.add(new Word("El cuerpo","にくたい","肉体",7));
        words7.add(new Word("Frase","ぶん","文",7));
        words7.add(new Word("Literatura","ぶんがく","文学",7));
        words7.add(new Word("Ministerio educación","もんぶしょう","文部省",7));
        words7.add(new Word("Caracteres chinos","じ","字",7));
        words7.add(new Word("Kanji","かんじ","漢字",7));
        words7.add(new Word("Una letra","もじ","文字",7));
        words7.add(new Word("… letras","~じ","~字",7));
        words7.add(new Word("Cosa","もの","物",7));
        words7.add(new Word("Ser vivo","せいぶつ","生物",7));
        words7.add(new Word("Comprar","かいもの","買い物",7));
        words7.add(new Word("Equipaje","にもつ","荷物",7));
        words7.add(new Word("Vaca","うし","牛",7));
        words7.add(new Word("Leche vaca","ぎゅうにゅう","牛乳",7));
        words7.add(new Word("Caballo","うま","馬",7));
        words7.add(new Word("Carruaje","ばしゃ","馬車",7));
        words7.add(new Word("Caballos de fuerza","ばりき","馬力",7));
        words7.add(new Word("Pájaro","とり","鳥",7));
        words7.add(new Word("Cisne","はくちょう","白鳥",7));
        words7.add(new Word("Pollo asado","やきとり","焼き鳥",7));
        words7.add(new Word("Pájaro salvaje","やちょう","野鳥",7));
        words7.add(new Word("Pescado","さかな","魚",7));
        words7.add(new Word("Pescaderia","さかなや","魚屋",7));
        words7.add(new Word("Pescado frito","やきざかな","焼き魚",7));
        words7.add(new Word("Goldfish","きんぎょ","金魚",7));

        words8.add(new Word("Periodico","しんぶん","新聞",8));
        words8.add(new Word("Año nuevo","しんねん","新年",8));
        words8.add(new Word("Carro nuevo","しんしゃ","新車",8));
        words8.add(new Word("Libro usado ","ふるほん","古本",8));
        words8.add(new Word("Carro de segunda ","ちゅうこしゃ","中古車",8));
        words8.add(new Word("El hijo mayor ","ちょうなん","長男",8));
        words8.add(new Word("Prefectura de nagano","ながの","長野",8));
        words8.add(new Word("Presidente ","がくちょう","学長",8));
        words8.add(new Word("","たんだい","短大",8));
        words8.add(new Word("Poco tiempo","たんじかん","短時間",8));
        words8.add(new Word("Bachillerato ","こうこう","高校",8));
        words8.add(new Word("Alta velocidad ","こうそく","高速",8));
        words8.add(new Word("Venta de garaje ","やすうり","安売り",8));
        words8.add(new Word("Seguro ","あんぜんな","安全な",8));
        words8.add(new Word("Sentirse aliviado","あんしんする","安心する",8));
        words8.add(new Word("Caerse, bajar","ていかする","低下する",8));
        words8.add(new Word("Temperatura baja","ていおん","低温",8));
        words8.add(new Word("Cuarto oscuro ","あんしつ","暗室",8));
        words8.add(new Word("Más o menos ","たしょう","多少",8));
        words8.add(new Word("Número grande ","たすう","たすう",8));
        words8.add(new Word("Niño","しょうねん","少年",8));
        words8.add(new Word("Niña","しょうじょ","少女",8));

        lessons.setWordsLesson1(words1);
        lessons.setWordsLesson2(words2);
        lessons.setWordsLesson3(words3);
        lessons.setWordsLesson4(words4);
        lessons.setWordsLesson5(words5);
        lessons.setWordsLesson6(words6);
        lessons.setWordsLesson7(words7);
        lessons.setWordsLesson8(words8);
        lessons.setWordsLesson9(words9);


        return lessons;
    }


}
