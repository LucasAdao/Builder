package com.lucas;

import com.lucas.models.*;

public class Main {
    public static void main(String[] args) {
//        Shinigami shinigami = new ShinigamiBuilder()
//                .nome("Gin")
//                .zanpakuto(new ZanpakutoBuilder()
//                        .nome("Shinsou")
//                        .bankai("Kamishini no Yari")
//                        .habilidade("É uma espada muito curta que se estica rapidamente surpreendendo o inimigo, além de possuir um veneno letal!")
//                        .build())
//                        .shinigamiTier(ShinigamiTier.CAPITAO).build();
//        System.out.println(shinigami);
//
        Shinigami shinigami2 = new Shinigami("Hitsugaya Toshiro",
                new Zanpakuto(
                        "Hyorymaru",
                        "Daiguren Hyorymaru",
                        "Gerar um gelo tão poderoso a ponto de congelar energia espiritual!"),
                ShinigamiTier.CAPITAO);
        System.out.println("-------------------------------------");
//        System.out.println(shinigami2);

        Shinigami shinigami1 = new ShinigamiBuilder()
                .shinigamiTier(ShinigamiTier.SHINIGAMI_COMUM)
                .zanpakuto(new Zanpakuto("Sodenoshiraiuki" , "bankai" , "ar frio"))
                .nome("Rukia")
                .build();

        System.out.println("###################################################");
        System.out.println(shinigami1);
        System.out.println("###################################################");
        System.out.println(shinigami2);
        System.out.println("###################################################");


        }
    }
