package com.example.a7.remotelist.model

import com.example.a7.applist.model.LP_web

class LP_data {

    fun getLP_web(): ArrayList<LP_web> {
        val soccerTeamList: ArrayList<LP_web> = ArrayList<LP_web>()

        soccerTeamList.add(LP_web("volkswagem", "1930",
                "O Grupo Volkswagen, além da marca Volkswagen, é, também, proprietário das marcas Audi, Bentley, Bugatti, Ducati, Lamborghini, Seat, Porsche, Škoda Auto, MAN, Volkswagen Caminhões e Ônibus e Scania. Em março de 2011, a Volkswagen adquiriu o segmento comercial da Porsche[2] por 3,3 bilhões de euros, adquirindo, assim, o direito de negociar e operar a marca \"Porsche\", fazendo com que a Volkswagen fique mais próxima à fusão com a \"PHS\" (Porsche Holding Salzburg)."
                , "http://autoetecnica.band.uol.com.br/wp-content/uploads/2013/03/09_VOLKS_legendaLogoVolkswagende1999ate2012_25-02-13.jpg"))

        soccerTeamList.add(LP_web("chevrolet", "1912",
                "Em 3 de novembro de 1911, o piloto de corridas de carro e engenheiro de automóveis, Louis Chevrolet co-fundou a Chevrolet Motor Car Company, com William C. Durant (fundador da General Motors, deposto por 5 anos) e o parceiros de investimento, William Little (fabricante do automóvel Little), Edwin R. Campbell (genro de Durant) e, em 1912, R.S. McLaughlin, do Canadá."
                , "https://upload.wikimedia.org/wikipedia/pt/3/34/Chevrolet_logo.png"))

        soccerTeamList.add(LP_web("FIAT", "1914",
                "FIAT (Fabbrica Italiana Automobili Torino) é uma das marcas da Fiat Chrysler Automobiles[1], um dos maiores fabricantes de automóveis do mundo, com sede mundial na cidade de Turim, norte da Itália. A empresa Fiat Automobiles S.p.A foi formada em janeiro de 2007, quando a Fiat reorganizou seus negócios automotivos, e traça a sua história de volta a 1899, quando o primeiro Fiat foi produzido."
                , "https://banner2.kisspng.com/20180205/ayw/kisspng-fiat-automobiles-car-logo-fiat-500x-fiat-logo-png-photos-5a78a627b71b68.26173736151785629575.jpg"))

        soccerTeamList.add(LP_web("FORD", "1910",
                "Ford Motor Company (geralmente referida simplesmente como Ford) é uma fabricante de automóveis multinacional estadunidense sediada em Dearborn, Michigan, um subúrbio de Detroit. Foi fundada por Henry Ford e incorporada em 16 de junho de 1903. A companhia vende carros e veículos comerciais sob a marca de Ford e a maioria de seus carros de luxo sob a marca Lincoln. Ford também possui o fabricante brasileiro de SUV, Troller, e o fabricante de carros australiano FPV. No passado, também produziu tratores e componentes automotivos. A Ford detém uma participação de 2,1% na Mazda do Japão, uma participação de 8% na Aston Martin do Reino Unido e uma participação de 49% na Jiangling da China. Também tem uma série de joint-ventures, sendo uma na China (Changan Ford), Taiwan (Ford Lio Ho), Tailândia (AutoAlliance Tailândia), Turquia (Ford Otosan) e Rússia (Ford Sollers). É listada na Bolsa de Valores de Nova York e é controlado pela família Ford, embora eles tenham propriedade minoritária (mas a maioria do poder de voto)"
                , "https://banner2.kisspng.com/20180826/sxy/kisspng-ford-focus-electric-car-logo-ford-ranger-ford-5b8343f3029f02.3768071415353292670108.jpg"))

        return soccerTeamList;
    }
}
