package com.jrmd.benkyoshimasu;

import android.content.Context;
import android.util.DisplayMetrics;

import com.jrmd.benkyoshimasu.object.Word;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by julian on 07/11/2016.
 */

public class Utils {

    public static List<Word> loadAllWords(){
        List<Word> words = new ArrayList<Word>();
        words.add(new Word("Maestro/Profesor","せんせい","先生",1));
        words.add(new Word("Maestro/Profesor","きょうし","",1));
        words.add(new Word("Estudíante","がくせい","学生",1));
        words.add(new Word("Empleado de empresa","かいしゃいん","",1));
        words.add(new Word("Médico","いしゃ","",1));
        words.add(new Word("Investigador","けんきゅうしゃ","",1));
        words.add(new Word("Ingeniero","エンジニア","",1));
        words.add(new Word("Universidad","だいがく","大学",1));
        words.add(new Word("Hospital","びょういん","",1));
        words.add(new Word("Libro","ほん","本",2));
        words.add(new Word("Diccionario","じしょ","",2));
        words.add(new Word("Revista","ざっし","",2));
        words.add(new Word("Periodico","しんぶん","",2));
        words.add(new Word("Cuaderno","ノート","",2));
        words.add(new Word("Agenda","てちょう","",2));
        words.add(new Word("Tarjeta de Negocio","めいし","",2));
        words.add(new Word("Tarjeta","カード","",2));
        words.add(new Word("Tarjeta de teléfono","テレホンカード","",2));
        words.add(new Word("Lápiz","えんぴつ","",2));
        words.add(new Word("Esfero","ボールペン","",2));
        words.add(new Word("Portaminas","シャープペンシル","",2));
        words.add(new Word("Llave","かぎ","",2));
        words.add(new Word("Reloj","とけい","",2));
        words.add(new Word("Sombrilla","かさ","",2));
        words.add(new Word("Maleta","かばん","",2));
        words.add(new Word("Cinta/Cassette","テープ。カセット","",2));
        words.add(new Word("Grabadora","テープレコーダー","",2));
        words.add(new Word("Televisión","テレビ","",2));
        words.add(new Word("Radio","ラジオ","",2));
        words.add(new Word("Cámara","カメラ","",2));
        words.add(new Word("Computador","コンピューター","",2));
        words.add(new Word("Automóvil","じどうしゃ","自動車",2));
        words.add(new Word("Escritorio","つくえ","",2));
        words.add(new Word("Silla","いす","",2));
        words.add(new Word("Chocolate","チョコレート","",2));
        words.add(new Word("Café","コーヒー","",2));
        words.add(new Word("Salón de clase","きょうしつ","",3));
        words.add(new Word("Comedor","しょくど","",3));
        words.add(new Word("Oficina","じむしょ","",3));
        words.add(new Word("Sala de reuniones","かいぎしつ","",3));
        words.add(new Word("Recepción","うけつけ","",3));
        words.add(new Word("Lóbi/Vestíbulo","ロビー","",3));
        words.add(new Word("Habitación","へや","",3));
        words.add(new Word("Baño","トイレ","",3));
        words.add(new Word("Baño","おてあらい","",3));
        words.add(new Word("Escalera","かいだん","",3));
        words.add(new Word("Ascensor","エレベーター","",3));
        words.add(new Word("Escalera Electrica","エスカレーター","",3));
        words.add(new Word("Empresa","かいしゃ","",3));
        words.add(new Word("Casa","うち","",3));
        words.add(new Word("Teléfono","でんわ","",3));
        words.add(new Word("Zapatos","くつ","",3));
        words.add(new Word("Corbata","ネクタイ","",3));
        words.add(new Word("Vino","ワイン","",3));
        words.add(new Word("Tabaco","たばこ","",3));
        words.add(new Word("Sección(almacenes)","うりば","",3));
        words.add(new Word("Sótano","ちか","",3));
        words.add(new Word("- Piso","かい","",3));
        words.add(new Word("- Yen","えん","",3));
        words.add(new Word("Cien","ひゃく","百",3));
        words.add(new Word("Mil","せん","千",3));
        words.add(new Word("Diez Mil","まん","万",3));
        words.add(new Word("Levantarse","おきます","",4));
        words.add(new Word("Acostarse","ねます","",4));
        words.add(new Word("Trabajar","はたらきます","",4));
        words.add(new Word("Descansar","やすみます","",4));
        words.add(new Word("Estudíar","べんきょします","",4));
        words.add(new Word("Terminar","おわります","",4));
        words.add(new Word("Supermercado","デパート","",4));
        words.add(new Word("Banco","ぎんこう","",4));
        words.add(new Word("Oficina de correos","ゆうびんきょく","",4));
        words.add(new Word("Biblioteca","としょかん","",4));
        words.add(new Word("Museo de arte","びじゅつかん","",4));
        words.add(new Word("Ahora","いま","今",4));
        words.add(new Word("De la mañana","ごぜん","",4));
        words.add(new Word("De la tarde","ごご","",4));
        words.add(new Word("La mañana","あさ","",4));
        words.add(new Word("Mediodía","ひる","",4));
        words.add(new Word("Noche","ばん","",4));
        words.add(new Word("Anteayer","おととい","",4));
        words.add(new Word("Ayer","きのう","",4));
        words.add(new Word("Hoy","きょう","",4));
        words.add(new Word("Mañana","あした","",4));
        words.add(new Word("Pasado Mañana","あさって","",4));
        words.add(new Word("Esta mañana","けさ","",4));
        words.add(new Word("Esta noche","こんばん","",4));
        words.add(new Word("Descanso/día libre","やすみ","",4));
        words.add(new Word("Descanso de mediodía","ひるやすみ","",4));
        words.add(new Word("Todas las mañanas","まいあさ","",4));
        words.add(new Word("Todas las noches","まいばｎ","",4));
        words.add(new Word("Todos los días","まいにち","",4));
        words.add(new Word("Lunes","げつようび","月曜日",4));
        words.add(new Word("Martes","かようび","火曜日",4));
        words.add(new Word("Miercoles","すいようび","水曜日",4));
        words.add(new Word("Jueves","もくようび","木曜日",4));
        words.add(new Word("Viernes","きんようび","金曜日",4));
        words.add(new Word("Sabado","どようび","土曜日",4));
        words.add(new Word("Domingo","にちようび","日曜日",4));
        words.add(new Word("Número","ばんごう","",4));
        words.add(new Word("Qué Número","なんばん","",4));
        words.add(new Word("Desde -"," - から","",4));
        words.add(new Word("Hasta -"," - まで","",4));
        words.add(new Word("Ir","いきます","",5));
        words.add(new Word("Venir","きます","",5));
        words.add(new Word("Volver","かえります","",5));
        words.add(new Word("Escuela","がっこう","",5));
        words.add(new Word("Estación de tren","えき","",5));
        words.add(new Word("Avión","ひこうき","",5));
        words.add(new Word("Barco","ふね","",5));
        words.add(new Word("Tren eléctrico","でんしゃ","",5));
        words.add(new Word("Metro","ちかてつ","",5));
        words.add(new Word("Tren bala","しんかんせん","",5));
        words.add(new Word("Bus","バス","",5));
        words.add(new Word("Taxi","タクシー","",5));
        words.add(new Word("Bicicleta","してんしゃ","",5));
        words.add(new Word("A pie","あるいて","",5));
        words.add(new Word("Persona","ひと","人",5));
        words.add(new Word("Amigo/a(s)","ともだち","",5));
        words.add(new Word("Novio","かれ","",5));
        words.add(new Word("Novia","かのじょ","",5));
        words.add(new Word("Familia","かぞく","",5));
        words.add(new Word("Solo/a","ひとりで","",5));
        words.add(new Word("La semana pasada","せんしょう","",5));
        words.add(new Word("Esta Semana","こんしょう","",5));
        words.add(new Word("La próxima semana","らいしょう","",5));
        words.add(new Word("El mes pasado","せんげつ","先月",5));
        words.add(new Word("Este mes","こんげつ","",5));
        words.add(new Word("El próximo mes","らいげつ","",5));
        words.add(new Word("El año pasado","きょねん","",5));
        words.add(new Word("Este año","ことし","",5));
        words.add(new Word("El proximo año","らいねん","",5));
        words.add(new Word("Primer día del mes","ついたち","１日",5));
        words.add(new Word("2do día del mes","ふつか","２日",5));
        words.add(new Word("3er día del mes","みっか","３日",5));
        words.add(new Word("4to día del mes","よっか","４日",5));
        words.add(new Word("5to día del mes","いつか","５日",5));
        words.add(new Word("6to día del mes","むいか","６日",5));
        words.add(new Word("7to día del mes","なのか","７日",5));
        words.add(new Word("8to día del mes","ようか","８日",5));
        words.add(new Word("9to día del mes","ここのか","９日",5));
        words.add(new Word("10mo día del mes","よおか","１０日",5));
        words.add(new Word("14vo día del mes","じゅうよっか","１４日",5));
        words.add(new Word("20vo día del mes","はつか","２０日",5));
        words.add(new Word("24vo día del mes","にじゅうよっか","２４日",5));
        words.add(new Word("Cúando","いつ","",5));
        words.add(new Word("Cumpleaños","たんじょうび","",5));


        return words;
    }

    public static int dpToPx(Context context, int dp) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int px = Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
        return px;
    }
}
