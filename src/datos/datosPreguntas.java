package datos;

import model.Actividades;
import model.Respuesta;

public class datosPreguntas {
		
	public datosPreguntas() {
		
	}
		
		//Aqui se encuentras las respuestas junto a sus preguntas
		//RESPUESTAS DE LAS PREGUNTAS, HAY 61 PREGUNTAS 
		//CREAMOS LAS RESPUESTAS A CADA PREGUNTA PASANDO EL TEXTO Y SI SON VERDADERAS O FALSAS
		Respuesta r1 = new Respuesta ("1945",true);
		Respuesta r2 = new Respuesta ("1939",false);
		Respuesta r3 = new Respuesta ("1944",false);
		Respuesta r4 = new Respuesta ("1936",false);
		//CREAMOS UN ARRAY DONDE METEMOS LAS RESPUESTAS POSIBLES PARA LA ACTIVIDAD (EN ESTE CASO) 1.
		Respuesta []a1={r1,r2,r3,r4};
		
		Respuesta r5 = new Respuesta ("El Nilo",false);
		Respuesta r6 = new Respuesta ("El Amazonas",true);
		Respuesta r7 = new Respuesta ("El Misisipi",false);
		Respuesta r8 = new Respuesta ("El Orinoco",false);
		Respuesta []a2={r5,r6,r7,r8};
		
		Respuesta r9 = new Respuesta ("Miguel de Cervantes",true);
		Respuesta r10 = new Respuesta ("William Shakespeare",false);
		Respuesta r11 = new Respuesta ("Charles Dickens",false);
		Respuesta r12 = new Respuesta ("Edgar Allan Poe",false);
		Respuesta []a3={r9,r10,r11,r12};

		Respuesta r13 = new Respuesta ("Sandro Boticcelli",false);
		Respuesta r14 = new Respuesta ("Miguel Ángel",false);
		Respuesta r15 = new Respuesta ("Leonardo Da Vinci",true);
		Respuesta r16 = new Respuesta ("Tiziano Vecellio",false);
		Respuesta []a4={r13,r14,r15,r16};

		Respuesta r17 = new Respuesta ("Barcelona",true);
		Respuesta r18 = new Respuesta ("Madrid",false);
		Respuesta r19 = new Respuesta ("Sevilla",false);
		Respuesta r20 = new Respuesta ("Valencia",false);
		Respuesta []a5={r17,r18,r19,r20};
		
		Respuesta r21 = new Respuesta ("Océano Atlántico",false);
		Respuesta r22 = new Respuesta ("Océano Pacífico",true);
		Respuesta r23 = new Respuesta ("Océano Índico",false);
		Respuesta r24 = new Respuesta ("Océano Glacial Ártico",false);
		Respuesta []a6={r21,r22,r23,r24};
		
		Respuesta r25 = new Respuesta ("Fútbol",false);
		Respuesta r26 = new Respuesta ("Natación",false);
		Respuesta r27 = new Respuesta ("Rugby",false);
		Respuesta r28 = new Respuesta ("Baloncesto",true);
		Respuesta []a7={r25,r26,r27,r28};
		
		Respuesta r29 = new Respuesta ("Saturno",false);
		Respuesta r30 = new Respuesta ("Urano",false);
		Respuesta r31 = new Respuesta ("Júpiter",true);
		Respuesta r32 = new Respuesta ("Neptuno",false);
		Respuesta []a8={r29,r30,r31,r32};
		
		Respuesta r33 = new Respuesta ("Libra",true);
		Respuesta r34 = new Respuesta ("Euro",false);
		Respuesta r35 = new Respuesta ("Dólar",false);
		Respuesta r36 = new Respuesta ("Peso",false);
		Respuesta []a9={r33,r34,r35,r36};
		
		Respuesta r37 = new Respuesta ("Avestruz",false);
		Respuesta r38 = new Respuesta ("Guepardo",true);
		Respuesta r39 = new Respuesta ("Liebre",false);
		Respuesta r40 = new Respuesta ("Tigre Siberiano",false);
		Respuesta []a10={r37,r38,r39,r40};
		
		Respuesta r41 = new Respuesta ("Francia",false);
		Respuesta r42 = new Respuesta ("España",false);
		Respuesta r43 = new Respuesta ("Italia",false);
		Respuesta r44 = new Respuesta ("Alemania",true);
		Respuesta []a11={r41,r42,r43,r44};
		
		Respuesta r45 = new Respuesta ("3.1414",false);
		Respuesta r46 = new Respuesta ("3.1416",true);
		Respuesta r47 = new Respuesta ("3.1413",false);
		Respuesta r48 = new Respuesta ("3.1417",false);
		Respuesta []a12={r45,r46,r47,r48};

		Respuesta r49 = new Respuesta ("Equilatero",true);
		Respuesta r50 = new Respuesta ("Isósceles",false);
		Respuesta r51 = new Respuesta ("Escaleno",false);
		Respuesta r052 = new Respuesta ("Acutángulo",false);
		Respuesta []a13={r49,r50,r51,r052};
		
		Respuesta r52 = new Respuesta ("Oro",false);
		Respuesta r53 = new Respuesta ("Platino",false);
		Respuesta r54 = new Respuesta ("Rodio",true);
		Respuesta r55 = new Respuesta ("Rutenio",false);
		Respuesta []a14={r52,r53,r54,r55};
		
		Respuesta r56 = new Respuesta ("2",false);
		Respuesta r57 = new Respuesta ("1",false);
		Respuesta r58 = new Respuesta ("3",true);
		Respuesta r59 = new Respuesta ("4",false);
		Respuesta []a15={r56,r57,r58,r59};
		
		Respuesta r60 = new Respuesta ("Nilo",false);
		Respuesta r61 = new Respuesta ("Amazonas",true);
		Respuesta r62 = new Respuesta ("Misisipi",false);
		Respuesta r63 = new Respuesta ("Orinoco",false);
		Respuesta []a16={r60,r61,r62,r63};
		
		Respuesta r64 = new Respuesta ("Sidney",false);
		Respuesta r65 = new Respuesta ("Melbourne",false);
		Respuesta r66 = new Respuesta ("Canberra",true);
		Respuesta r67 = new Respuesta ("Brisbane",false);
		Respuesta []a17={r64,r65,r66,r67};
		
		Respuesta r68 = new Respuesta ("Pitón reticulada",true);
		Respuesta r69 = new Respuesta ("Anaconda verde",false);
		Respuesta r70 = new Respuesta ("Pitón Birmana",false);
		Respuesta r71 = new Respuesta ("Pitón Rock Africana",false);
		Respuesta []a18={r68,r69,r70,r71};
		
		Respuesta r72 = new Respuesta ("Tajo",true);
		Respuesta r73 = new Respuesta ("Ebro",false);
		Respuesta r74 = new Respuesta ("Guadalquivir",false);
		Respuesta r75 = new Respuesta ("Duero",false);
		Respuesta []a19={r72,r73,r74,r75};
		
		Respuesta r76 = new Respuesta ("Brasil",false);
		Respuesta r77 = new Respuesta ("República Popular China",false);
		Respuesta r78 = new Respuesta ("Rusia",true);
		Respuesta r79 = new Respuesta ("Canadá",false);
		Respuesta []a20={r76,r77,r78,r79};
		
		Respuesta r80 = new Respuesta ("Estocolmo",true);
		Respuesta r81 = new Respuesta ("Gotemburgo",false);
		Respuesta r82 = new Respuesta ("Malmö",false);
		Respuesta r83 = new Respuesta ("Helsingborg",false);
		Respuesta []a21={r80,r81,r82,r83};
		
		Respuesta r84 = new Respuesta ("Leoniano",false);
		Respuesta r85 = new Respuesta ("Leonense",true);
		Respuesta r86 = new Respuesta ("Leonano",false);
		Respuesta r87 = new Respuesta ("Leoniense",false);
		Respuesta []a22={r84,r85,r86,r87};
		
		Respuesta r88 = new Respuesta ("En embellecer la oración añadiendo información",false);
		Respuesta r89 = new Respuesta ("En alterar el orden lógico de la oración",false);
		Respuesta r90 = new Respuesta ("En mezclar partes de palabra para formar una nueva",false);
		Respuesta r91 = new Respuesta ("En aumentar o disminuir la verdad de lo hablado",true);
		Respuesta []a23={r88,r89,r90,r91};
		
		Respuesta r92 = new Respuesta ("Adjetivo",false);
		Respuesta r93 = new Respuesta ("Verbo",false);
		Respuesta r94 = new Respuesta ("Sustantivo ",false);
		Respuesta r95 = new Respuesta ("Adverbio",true);
		Respuesta []a24={r92,r93,r94,r95};
		
		Respuesta r96 = new Respuesta ("1979",false);
		Respuesta r97 = new Respuesta ("1974",false);
		Respuesta r98 = new Respuesta ("1975",true);
		Respuesta r99 = new Respuesta ("1978",false);
		Respuesta []a25={r96,r97,r98,r99};
		
		Respuesta r100 = new Respuesta ("Transparencia",false);
		Respuesta r101 = new Respuesta ("Refracción",true);
		Respuesta r102 = new Respuesta ("Dispersión",false);
		Respuesta r103 = new Respuesta ("Reflexión",false);
		Respuesta []a26={r100,r101,r102,r103};
		
		Respuesta r104 = new Respuesta ("Albacetano",false);
		Respuesta r105 = new Respuesta ("Albacetense",false);
		Respuesta r106 = new Respuesta ("Albacereño",false);
		Respuesta r107 = new Respuesta ("Albaceteño",true);
		Respuesta []a27={r104,r105,r106,r107};
		
		Respuesta r108 = new Respuesta ("Menos de 90",true);
		Respuesta r109 = new Respuesta ("120",false);
		Respuesta r110 = new Respuesta ("180",false);
		Respuesta r111 = new Respuesta ("360",false);
		Respuesta []a28={r108,r109,r110,r111};
		
		Respuesta r112 = new Respuesta ("Neoclásico",false);
		Respuesta r113 = new Respuesta ("Románico",false);
		Respuesta r114 = new Respuesta ("Fenicio",false);
		Respuesta r115 = new Respuesta ("Gótico",true);
		Respuesta []a29={r112,r113,r114,r115};
		
		Respuesta r116 = new Respuesta ("William Henry",false);
		Respuesta r117 = new Respuesta ("Galileo Galilei",false);
		Respuesta r118 = new Respuesta ("Daniel Bernoulli",false);
		Respuesta r119 = new Respuesta ("Isaac Newton",true);
		Respuesta []a30={r116,r117,r118,r119};	
		
		Respuesta r120 = new Respuesta ("La sedentarización de la vida",false);
		Respuesta r121 = new Respuesta ("La aparición de los megalitos",true);
		Respuesta r122 = new Respuesta ("La aparición del fuego",false);
		Respuesta r123 = new Respuesta ("La aparición de la escritura",false);
		Respuesta []a31={r120,r121,r122,r123};

		Respuesta r124 = new Respuesta ("Peloponesas",false);
		Respuesta r125 = new Respuesta ("Púnicas",true);
		Respuesta r126 = new Respuesta ("Romanas",false);
		Respuesta r127 = new Respuesta ("Cartaginenses",false);
		Respuesta []a32={r124,r125,r126,r127};
		
		Respuesta r128 = new Respuesta ("Macedonia",false);
		Respuesta r129 = new Respuesta ("Sicilia",true);
		Respuesta r130 = new Respuesta ("Córcega",false);
		Respuesta r131 = new Respuesta ("Cerdeña",false);
		Respuesta []a33={r128,r129,r130,r131};
		
		Respuesta r132 = new Respuesta ("Van Gogh",false);
		Respuesta r133 = new Respuesta ("Pablo Picasso",false);
		Respuesta r134 = new Respuesta ("Diego Velázquez",true);
		Respuesta r135 = new Respuesta ("Miguel Ángel",false);
		Respuesta []a34={r132,r133,r134,r135};
		
		Respuesta r136 = new Respuesta ("Transporte de mercancias",true);
		Respuesta r137 = new Respuesta ("Ocio",false);
		Respuesta r138 = new Respuesta ("Unidades militares",false);
		Respuesta r139 = new Respuesta ("Extracción del carbón en las minas",false);
		Respuesta []a35={r136,r137,r138,r139};
		
		Respuesta r140 = new Respuesta ("Fusión",true);
		Respuesta r141 = new Respuesta ("Solidificación",false);
		Respuesta r142 = new Respuesta ("Sublimación",false);
		Respuesta r143 = new Respuesta ("Condensación",false);
		Respuesta []a36={r140,r141,r142,r143};
		
		Respuesta r144 = new Respuesta ("Batalla del Ebro",false);
		Respuesta r145 = new Respuesta ("Batalla de Lepanto",false);
		Respuesta r146 = new Respuesta ("Batalla de Waterloo",false);
		Respuesta r147 = new Respuesta ("Batalla de Trafalgar",true);
		Respuesta []a37={r144,r145,r146,r147};
		
		Respuesta r148 = new Respuesta ("Condensación",true);
		Respuesta r149 = new Respuesta ("Fusión",false);
		Respuesta r150 = new Respuesta ("Sublimación",false);
		Respuesta r151 = new Respuesta ("Solidificación",false);
		Respuesta []a38={r148,r149,r150,r151};
		
		Respuesta r152 = new Respuesta ("Entre 4 y 5 litros",false);
		Respuesta r153 = new Respuesta ("Entre 5 y 6 litros",true);
		Respuesta r154 = new Respuesta ("Entre 1 y 2 litros",false);
		Respuesta r155 = new Respuesta ("Entre 3 y 4 litros",false);
		Respuesta []a39={r152,r153,r154,r155};

		Respuesta r156 = new Respuesta ("Neoclásico",false);
		Respuesta r157 = new Respuesta ("Románico",false);
		Respuesta r158 = new Respuesta ("Gótico",true);
		Respuesta r0159 = new Respuesta ("Barroco",false);
		Respuesta []a40={r156,r157,r158,r0159};
		
		Respuesta r159 = new Respuesta ("Mesopotamia",true);
		Respuesta r160 = new Respuesta ("Egipcia",false);
		Respuesta r161 = new Respuesta ("Griega",false);
		Respuesta r162= new Respuesta ("Romana",false);
		Respuesta []a41={r159,r160,r161,r162};
		
		Respuesta r163 = new Respuesta ("1990",false);
		Respuesta r164 = new Respuesta ("1998",false);
		Respuesta r165 = new Respuesta ("1989",true);
		Respuesta r166 = new Respuesta ("1980",false);
		Respuesta []a42={r163,r164,r165,r166};
		
		Respuesta r167 = new Respuesta ("Marie Curie",false);
		Respuesta r168 = new Respuesta ("Pascal",false);
		Respuesta r169 = new Respuesta ("Pasteur",false);
		Respuesta r170 = new Respuesta ("Flemming",true);
		Respuesta []a43={r167,r168,r169,r170};
		
		Respuesta r171 = new Respuesta ("Elípticas",true);
		Respuesta r172 = new Respuesta ("Uniformes",false);
		Respuesta r173 = new Respuesta ("Concéntricas",false);
		Respuesta r174 = new Respuesta ("Circulares",false);
		Respuesta []a44={r171,r172,r173,r174};
		
		Respuesta r175 = new Respuesta ("Lugo",false);
		Respuesta r176 = new Respuesta ("Ourense",false);
		Respuesta r177 = new Respuesta ("Santiago de Compostela",true);
		Respuesta r178 = new Respuesta ("La Coruña",false);
		Respuesta []a45={r175,r176,r177,r178};
		
		Respuesta r179 = new Respuesta ("La molécula",false);
		Respuesta r180 = new Respuesta ("La célula",true);
		Respuesta r181 = new Respuesta ("El mol",false);
		Respuesta r182 = new Respuesta ("El átomo",false);
		Respuesta []a46={r179,r180,r181,r182};
		
		Respuesta r183 = new Respuesta ("Manila",false);
		Respuesta r184 = new Respuesta ("Tokio",false);
		Respuesta r185 = new Respuesta ("Seúl",true);
		Respuesta r186 = new Respuesta ("Hong Kong",false);
		Respuesta []a47={r183,r184,r185,r186};
		
		Respuesta r187 = new Respuesta ("21 de julio",false);
		Respuesta r188 = new Respuesta ("21 de agosto",false);
		Respuesta r189 = new Respuesta ("21 de septiembre",true);
		Respuesta r190 = new Respuesta ("21 de octubre",false);
		Respuesta []a48={r187,r188,r189,r190};
		
		Respuesta r191 = new Respuesta ("Danubio",true);
		Respuesta r192 = new Respuesta ("Sena",false);
		Respuesta r193 = new Respuesta ("Volga",false);
		Respuesta r194 = new Respuesta ("Rhin",false);
		Respuesta []a49={r191,r192,r193,r194};
		
		Respuesta r195 = new Respuesta ("Ósmosis",false);
		Respuesta r196 = new Respuesta ("Escisión",true);
		Respuesta r197 = new Respuesta ("Mediante huevos",false);
		Respuesta r198 = new Respuesta ("Meiosis",false);
		Respuesta []a50={r195,r196,r197,r198};
		
		Respuesta r199 = new Respuesta ("Plomo",true);
		Respuesta r200 = new Respuesta ("Praseodimio",false);
		Respuesta r201 = new Respuesta ("Polonio ",false);
		Respuesta r202 = new Respuesta ("Platino",false);
		Respuesta []a51={r199,r200,r201,r202};
		
		Respuesta r203 = new Respuesta ("El color",false);
		Respuesta r204 = new Respuesta ("La temperatura",false);
		Respuesta r205 = new Respuesta ("El peso atómico",true);
		Respuesta r206 = new Respuesta ("El tamaño",false);
		Respuesta []a52={r203,r204,r205,r206};
		
		Respuesta r207 = new Respuesta ("Una planta",false);
		Respuesta r208 = new Respuesta ("Un árbol",true);
		Respuesta r209 = new Respuesta ("Una flor",false);
		Respuesta r210 = new Respuesta ("Un arbusto",false);
		Respuesta []a53={r207,r208,r209,r210};
		
		Respuesta r211 = new Respuesta ("Epidermis",true);
		Respuesta r212 = new Respuesta ("Músculo",false);
		Respuesta r213 = new Respuesta ("Hueso",false);
		Respuesta r214 = new Respuesta ("Piel",false);
		Respuesta []a54={r211,r212,r213,r214};
		
		Respuesta r215 = new Respuesta ("Consonante y rimante",false);
		Respuesta r216 = new Respuesta ("Consonante y asonante",true);
		Respuesta r217 = new Respuesta ("Consonante y necrótica",false);
		Respuesta r218 = new Respuesta ("Consonante y disonante",false);
		Respuesta []a55={r215,r216,r217,r218};
		
		Respuesta r219 = new Respuesta ("2002",true);
		Respuesta r220 = new Respuesta ("2000",false);
		Respuesta r221 = new Respuesta ("2003",false);
		Respuesta r222 = new Respuesta ("2001",false);
		Respuesta []a56={r219,r220,r221,r222};
		
		Respuesta r223 = new Respuesta ("30",false);
		Respuesta r224 = new Respuesta ("8",false);
		Respuesta r225 = new Respuesta ("12",false);
		Respuesta r226 = new Respuesta ("20",true);
		Respuesta []a57={r223,r224,r225,r226};


		Respuesta r227 = new Respuesta ("BABA",false);
		Respuesta r228 = new Respuesta ("ABBA",true);
		Respuesta r229 = new Respuesta ("ABAB",false);
		Respuesta r230 = new Respuesta ("AABB",false);
		Respuesta []a58={r227,r228,r229,r230};
		
		Respuesta r231 = new Respuesta ("Entre 5 y 6 metros",false);
		Respuesta r232 = new Respuesta ("Entre 4 y 5 metros",false);
		Respuesta r233 = new Respuesta ("Entre 6 y 7 metros",true);
		Respuesta r234 = new Respuesta ("Entre 8 y 9 metros",false);
		Respuesta []a59={r231,r232,r233,r234};
		
		Respuesta r235 = new Respuesta ("Nivómetro",false);
		Respuesta r236 = new Respuesta ("Tensiómetro",false);
		Respuesta r237 = new Respuesta ("Barómetro",false);
		Respuesta r238 = new Respuesta ("Amperímetro",true);
		Respuesta []a60={r235,r236,r237,r238};
		
		Respuesta r239 = new Respuesta ("Angular al movimiento del cuerpo",false);
		Respuesta r240 = new Respuesta ("Contrario al movimiento del cuerpo",true);
		Respuesta r241 = new Respuesta ("Perpendicular al movimiento del cuerpo",false);
		Respuesta r242 = new Respuesta ("Misma dirección que el movimiento del cuerpo",false);
		Respuesta []a61={r239,r240,r241,r242};
		
		
		
		//RESPUESTAS DE LOS RETOS

		Respuesta r243 = new Respuesta ("Clave compacta",true);
		Respuesta r244 = new Respuesta ("Clave externa",false);
		Respuesta r245 = new Respuesta ("Clave alternativa",false);
		Respuesta r246 = new Respuesta ("Clave candidata",false);
		Respuesta []a62={r243,r244,r245,r246};
		
		// RESPUESTAS A LA PREGUNTA 63, DEBIDO A UN ERROR HE TENIDO QUE LLAMARLAS POR RESPUESTAS 0247 HASTA 0250.
		Respuesta r0247 = new Respuesta ("Prohibir la operación",false);
		Respuesta r0248 = new Respuesta ("Colocar nulos",false);
		Respuesta r0249 = new Respuesta ("Transmitir la operación en cascada",false);
		Respuesta r0250 = new Respuesta ("No usar el valor en defecto",true);
		Respuesta []a63={r0247,r0248,r0249,r0250};
		
		Respuesta r247 = new Respuesta ("Atributo=Fila, Tupla=Columna",false);
		Respuesta r248 = new Respuesta ("Atributo=Diagonal derecha, Tupla=Diagonal izquierda",false);
		Respuesta r249 = new Respuesta ("Atributo=Columna, Tupla=Fila",true);
		Respuesta r250 = new Respuesta ("Atributo=Diagonal izquierda, Tupla=Diagonal derecha",false);
		Respuesta []a64={r247,r248,r249,r250};
		
		Respuesta r251 = new Respuesta ("Independencia lógica",false);
		Respuesta r252 = new Respuesta ("Flexibilidad",false);
		Respuesta r253 = new Respuesta ("Independencia física",false);
		Respuesta r254 = new Respuesta ("Heterogeneidad",true);
		Respuesta []a65={r251,r252,r253,r254};
		
		Respuesta r255 = new Respuesta ("No obligatoriedad",false);
		Respuesta r256 = new Respuesta ("Restricción de multiplicidad",false);
		Respuesta r257 = new Respuesta ("Restricción de clave principal(primary key)",true);
		Respuesta r258 = new Respuesta ("Clave necesaria",false);
		Respuesta []a66={r255,r256,r257,r258};
		
		Respuesta r259 = new Respuesta ("La restricción de corrección",false);
		Respuesta r260 = new Respuesta ("La restricción de invocación",false);
		Respuesta r261 = new Respuesta ("La restricción de unilateralidad",false);
		Respuesta r262 = new Respuesta ("La restricción de unicidad",true);
		Respuesta []a67={r259,r260,r261,r262};
		
		Respuesta r263 = new Respuesta ("Ninguna de las demás respuestas es correcta",true);
		Respuesta r264 = new Respuesta ("Dependen del lenguaje de programación",false);
		Respuesta r265 = new Respuesta ("Que los disparadores prohíben que el atributo marcado de esta forma quede vacío y los triggers no",false);
		Respuesta r266 = new Respuesta ("Los triggers bloquea todo aquello que no respete la semántica y la otra no",false);
		Respuesta []a68={r263,r264,r265,r266};
		
		Respuesta r267 = new Respuesta ("Clave candidata que se escoge como identificador de la tabla",false);
		Respuesta r268 = new Respuesta ("Las demás respuestas son correctas",true);
		Respuesta r269 = new Respuesta ("La mejor clave candidata",false);
		Respuesta r270 = new Respuesta ("Conjunto de atributos que identifican unívocamente cada tupla de la relación",false);
		Respuesta []a69={r267,r268,r269,r270};
		
		Respuesta r271 = new Respuesta ("Restricción de unicidad",false);
		Respuesta r272 = new Respuesta ("Restricción de clave alternativa",false);
		Respuesta r273 = new Respuesta ("Restricción en cascada",true);
		Respuesta r274 = new Respuesta ("Restricción de obligatoriedad",false);
		Respuesta []a70={r271,r272,r273,r274};
		
		Respuesta r275 = new Respuesta ("Primarias o secundarias",false);
		Respuesta r276 = new Respuesta ("Persistentes o temporales",true);
		Respuesta r277 = new Respuesta ("Ninguna es correcta",false);
		Respuesta r278 = new Respuesta ("Normales o reflexivas",false);
		Respuesta []a71={r275,r276,r277,r278};
		
		Respuesta r279 = new Respuesta ("Es la parte final del código donde todo el mundo da lo mejor de sí para terminar lo más rápido posible",true);
		Respuesta r280 = new Respuesta ("Tiene una duración fija",false);
		Respuesta r281 = new Respuesta ("En el sprint se le asigna una tarea a cada uno para así tener claro qué es lo que tiene que hacer",false);
		Respuesta r282 = new Respuesta ("Todas las demás respuestas son correctas",false);
		Respuesta []a72={r279,r280,r281,r282};
		
		Respuesta r283 = new Respuesta ("Programa completo que puede ser ejecutado por el ordenador",false);
		Respuesta r284 = new Respuesta ("Código máquina generado tras compilar determinado código fuente",true);
		Respuesta r285 = new Respuesta ("Código escrito por un programador en un determinado lenguaje de programación",false);
		Respuesta r286 = new Respuesta ("Código generado en la fase de análisis",false);
		Respuesta []a73={r283,r284,r285,r286};
		
		Respuesta r287 = new Respuesta ("Física y digital",false);
		Respuesta r288 = new Respuesta ("De uso y de aplicación",false);
		Respuesta r289 = new Respuesta ("Orientada a futuros desarrollos o modificaciones de mantenimiento y uso y aplicación",true);
		Respuesta r290 = new Respuesta ("Física y de uso y aplicación",false);
		Respuesta []a74={r287,r288,r289,r290};
		
		Respuesta r291 = new Respuesta ("Desarrollo iterativo e incremental",true);
		Respuesta r292 = new Respuesta ("Ninguna es correcta",false);
		Respuesta r293 = new Respuesta ("Desarrollo incremental",false);
		Respuesta r294 = new Respuesta ("Desarrollo iterativo",false);
		Respuesta []a75={r291,r292,r293,r294};
		
		Respuesta r295 = new Respuesta ("No se maneja bien la memoria",true);
		Respuesta r296 = new Respuesta ("El difícil aprendizaje de este lenguaje",false);
		Respuesta r297 = new Respuesta ("Su lenguaje difícil y poco intuitivo",false);
		Respuesta r298 = new Respuesta ("Es antiguo",false);
		Respuesta []a76={r295,r296,r297,r298};
		
		Respuesta r299 = new Respuesta ("Subir los cambios al repositorio en Github(o similar)",false);
		Respuesta r300 = new Respuesta ("Descargar el repositorio de Github(o similar)",true);
		Respuesta r301 = new Respuesta ("Actualizar el directorio en tu ordenador",false);
		Respuesta r302 = new Respuesta ("Borrar tu repositorio en Github(o similar)",false);
		Respuesta []a77={r299,r300,r301,r302};
		
		Respuesta r303 = new Respuesta ("git log “comentario”",false);
		Respuesta r304 = new Respuesta ("git add . -comment “mensaje”",false);
		Respuesta r305 = new Respuesta ("git commit",false);
		Respuesta r306 = new Respuesta ("git commit -m “mensaje”",true);
		Respuesta []a78={r303,r304,r305,r306};
		
		Respuesta r307 = new Respuesta ("git add . log",false);
		Respuesta r308 = new Respuesta ("git status",true);
		Respuesta r309 = new Respuesta ("git state",false);
		Respuesta r310 = new Respuesta ("git log",false);
		Respuesta []a79={r307,r308,r309,r310};
		
		Respuesta r311 = new Respuesta ("Cambia el repositorio remoto a uno local",false);
		Respuesta r312 = new Respuesta ("Conecta un repositorio remoto a uno local",false);
		Respuesta r313 = new Respuesta ("Conecta un repositorio local a uno remoto",true);
		Respuesta r314 = new Respuesta ("Cambia el repositorio local a uno remoto",false);
		Respuesta []a80={r311,r312,r313,r314};
		
		Respuesta r315 = new Respuesta ("Nos permite obtener un registro de confirmaciones",true);
		Respuesta r316 = new Respuesta ("No es un comando de git",false);
		Respuesta r317 = new Respuesta ("Nos permite obtener un registro de confirmaciones sin el usuario que las ha realizado",false);
		Respuesta r318 = new Respuesta ("Nos permite obtener ayuda sobre otros comandos",false);
		Respuesta []a81={r315,r316,r317,r318};
		
		Respuesta r319 = new Respuesta ("Asigna el valor del lado derecho del operador a la variable del lado izquierdo",true);
		Respuesta r320 = new Respuesta ("Compara los valores de ambos lados del operador y dice si son iguales o no",false);
		Respuesta r321 = new Respuesta ("Reserva un espacio en la memoria del ordenador",false);
		Respuesta r322 = new Respuesta ("Informa que lo que hay en el lado izquierdo del operador es igual a lo que hay en el lado derecho",false);
		Respuesta []a82={r319,r320,r321,r322};
		
		Respuesta r323 = new Respuesta ("La palabra que identifica el tipo de dato que es",false);
		Respuesta r324 = new Respuesta ("El nombre que damos al tipo de dato que guardará la variable",false);
		Respuesta r325 = new Respuesta ("El valor que se guarda en la variable",false);
		Respuesta r326 = new Respuesta ("El nombre que damos a la variable",true);
		Respuesta []a83={r323,r324,r325,r326};

		Respuesta r327 = new Respuesta ("entero numero=0;",false);
		Respuesta r328 = new Respuesta ("int numero=0:",false);
		Respuesta r329 = new Respuesta ("int numero=0;",true);
		Respuesta r330 = new Respuesta ("int ‘Numero’=0;",false);
		Respuesta []a84={r327,r328,r329,r330};
		
		Respuesta r331 = new Respuesta ("Una sentencia que permite decidir si se ejecuta o no se ejecuta una sola vez un bloque aislado de código",false);
		Respuesta r332 = new Respuesta ("Una sentencia que ejecuta otra sentencia que a su vez ejecuta la primera sentencia",false);
		Respuesta r333 = new Respuesta ("Una sentencia que permite ejecutar un bloque aislado de código varias veces hasta que se cumpla(o deje de cumplirse) la condición asignada al bucle",true);
		Respuesta r334 = new Respuesta ("Las anteriores respuestas no son correctas",false);
		Respuesta []a85={r331,r332,r333,r334};
		
		Respuesta r335 = new Respuesta ("Permite decidir si se ejecuta o no se ejecuta una sola vez un bloque aislado de código",true);
		Respuesta r336 = new Respuesta ("Ejecuta otra sentencia que a su vez ejecuta la primera sentencia",false);
		Respuesta r337 = new Respuesta ("Permite ejecutar un bloque aislado de código varias veces hasta que se cumpla(o deje de cumplirse) la condición asignada.",false);
		Respuesta r338 = new Respuesta ("Las anteriores respuestas no son correctas",false);
		Respuesta []a86={r335,r336,r337,r338};
		
		Respuesta r339 = new Respuesta ("Correcto",true);
		Respuesta r340 = new Respuesta ("Incorrecto",false);
		Respuesta r341 = new Respuesta ("Incorrecto",false);
		Respuesta r342 = new Respuesta ("Incorrecto",false);
		Respuesta []a87={r339,r340,r341,r342};
		
		
		Respuesta r343 = new Respuesta ("Correcto",true);
		Respuesta r344 = new Respuesta ("Incorrecto",false);
		Respuesta r345 = new Respuesta ("Incorrecto",false);
		Respuesta r346 = new Respuesta ("Incorrecto",false);
		Respuesta []a88={r343,r344,r345,r346};
		
		
		Respuesta r347 = new Respuesta ("Correcto",true);
		Respuesta r348 = new Respuesta ("Incorrecto",false);
		Respuesta r349 = new Respuesta ("Incorrecto",false);
		Respuesta r350 = new Respuesta ("Incorrectoagonal derecha",false);
		Respuesta []a89={r347,r348,r349,r350};
		
		Respuesta r351 = new Respuesta ("Correcto",true);
		Respuesta r352 = new Respuesta ("Incorrecto",false);
		Respuesta r353 = new Respuesta ("Incorrecto",false);
		Respuesta r354 = new Respuesta ("Incorrecto",false);
		Respuesta []a90={r351,r352,r353,r354};
		
		Respuesta r355 = new Respuesta ("Correcto",true);
		Respuesta r356 = new Respuesta ("Incorrecto",false);
		Respuesta r357 = new Respuesta ("Incorrecto",false);
		Respuesta r358 = new Respuesta ("Incorrecto",false);
		Respuesta []a91={r355,r356,r357,r358};
		
		Respuesta r359 = new Respuesta ("<a></a>",true);
		Respuesta r360 = new Respuesta ("<link>",false);
		Respuesta r361 = new Respuesta ("<style>",false);
		Respuesta r362 = new Respuesta ("<div></div>",false);
		Respuesta []a92={r359,r360,r361,r362};
		
		Respuesta r363 = new Respuesta ("<li>",false);
		Respuesta r364 = new Respuesta ("<ol>",true);
		Respuesta r365 = new Respuesta ("<ul>",false);
		Respuesta r366 = new Respuesta ("<or>",false);
		Respuesta []a93={r363,r364,r365,r366};
		
		Respuesta r367 = new Respuesta ("<ul>",true);
		Respuesta r368 = new Respuesta ("<ol>",false);
		Respuesta r369 = new Respuesta ("<li>",false);
		Respuesta r370 = new Respuesta ("<des>",false);
		Respuesta []a94={r367,r368,r369,r370};
		
		Respuesta r371 = new Respuesta ("<br />",true);
		Respuesta r372 = new Respuesta ("<rb />",false);
		Respuesta r373 = new Respuesta ("<jump>",false);
		Respuesta r374 = new Respuesta ("<jm />",false);
		Respuesta []a95={r371,r372,r373,r374};
		
		Respuesta r375 = new Respuesta ("<i>",false);
		Respuesta r376 = new Respuesta ("<ng>",false);
		Respuesta r377 = new Respuesta ("<br>",false);
		Respuesta r378 = new Respuesta ("<b>",true);
		Respuesta []a96={r375,r376,r377,r378};
		
		Respuesta r379 = new Respuesta ("<ng>",false);
		Respuesta r380 = new Respuesta ("<br>",false);
		Respuesta r381 = new Respuesta ("<i>",true);
		Respuesta r382 = new Respuesta ("<b>",false);
		Respuesta []a97={r379,r380,r381,r382};
		
		Respuesta r383 = new Respuesta ("font-family",true);
		Respuesta r384 = new Respuesta ("font-style",false);
		Respuesta r385 = new Respuesta ("font-variant",false);
		Respuesta r386 = new Respuesta ("font-weight",false);
		Respuesta []a98={r383,r384,r385,r386};
		
		Respuesta r387 = new Respuesta ("font-style",false);
		Respuesta r388 = new Respuesta ("font-variant",true);
		Respuesta r389 = new Respuesta ("font-style",false);
		Respuesta r390 = new Respuesta ("font-weight",false);
		Respuesta []a99={r387,r388,r389,r390};
		
		Respuesta r391 = new Respuesta ("font-style",false);
		Respuesta r392 = new Respuesta ("font-weight",false);
		Respuesta r393 = new Respuesta ("font-size",true);
		Respuesta r394 = new Respuesta ("font-variant",false);
		Respuesta []a100={r391,r392,r393,r394};
			
		Respuesta r395 = new Respuesta ("border-radius",true);
		Respuesta r396 = new Respuesta ("border-form",false);
		Respuesta r397 = new Respuesta ("border-image",false);
		Respuesta r398 = new Respuesta ("border-shadow",false);
		Respuesta []a101={r395,r396,r397,r398};
		
		
		Respuesta r399 = new Respuesta ("...puedo tenerlos juntos en un zócalo, es lo que se llama tener varios núcleos",false);
		Respuesta r400 = new Respuesta ("...necesito tener 2 placas base, ya que cada placa base sólo dispone de 1 zócalo",false);
		Respuesta r401 = new Respuesta ("...necesito tener una placa base con 2 zócalos",true);
		Respuesta r402 = new Respuesta ("...necesito tener 2 placas base que tengan 2 zócalos cada una",false);
		Respuesta []a102={r399,r400,r401,r402};
		
		Respuesta r403 = new Respuesta ("Registro de estado",false);
		Respuesta r404 = new Respuesta ("Memoria",true);
		Respuesta r405 = new Respuesta ("Cabezal de lectura/escritura",false);
		Respuesta r406 = new Respuesta ("Todas las opciones son elementos de la máquina de Turing",false);
		Respuesta []a103={r403,r404,r405,r406};
		
		Respuesta r407 = new Respuesta ("Memoria principal",true);
		Respuesta r408 = new Respuesta ("Memoria caché",false);
		Respuesta r409 = new Respuesta ("Ninguna de las otras opciones",false);
		Respuesta r410 = new Respuesta ("Registros",false);
		Respuesta []a104={r407,r408,r409,r410};
		
		Respuesta r411 = new Respuesta ("Tienen un acceso más rápido",true);
		Respuesta r412 = new Respuesta ("Tienen mayor capacidad",false);
		Respuesta r413 = new Respuesta ("Son más baratas",false);
		Respuesta r414 = new Respuesta ("Pesan poco",false);
		Respuesta []a105={r411,r412,r413,r414};
		
		Respuesta r415 = new Respuesta ("Los directorios no tienen extensión en el nombre",false);
		Respuesta r416 = new Respuesta ("Los directorios tienen en el primer carácter de la línea un guión",false);
		Respuesta r417 = new Respuesta ("Los ficheros tienen en el primer carácter de la línea una d",false);
		Respuesta r418 = new Respuesta ("Ninguna de las otras respuestas es correcta",true);
		Respuesta []a106={r415,r416,r417,r418};
		
		Respuesta r419 = new Respuesta ("Ninguna de las anteriores",true);
		Respuesta r420 = new Respuesta ("Con la opción -b",false);
		Respuesta r421 = new Respuesta ("Con la opción -kb",false);
		Respuesta r422 = new Respuesta ("Con la opción -c",false);
		Respuesta []a107={r419,r420,r421,r422};
		
		Respuesta r423 = new Respuesta ("superuser",false);
		Respuesta r424 = new Respuesta ("root",false);
		Respuesta r425 = new Respuesta ("su",true);
		Respuesta r426 = new Respuesta ("sudo",false);
		Respuesta []a108={r423,r424,r425,r426};
		
		Respuesta r427 = new Respuesta ("chpass",false);
		Respuesta r428 = new Respuesta ("passwd",true);
		Respuesta r429 = new Respuesta ("password",false);
		Respuesta r430 = new Respuesta ("chown",false);
		Respuesta []a109={r427,r428,r429,r430};
		
		Respuesta r431 = new Respuesta ("adduser",true);
		Respuesta r432 = new Respuesta ("chmod",false);
		Respuesta r433 = new Respuesta ("chown",false);
		Respuesta r434 = new Respuesta ("passwd",false);
		Respuesta []a110={r431,r432,r433,r434};
		
		Respuesta r435 = new Respuesta ("chown",false);
		Respuesta r436 = new Respuesta ("chadd",false);
		Respuesta r437 = new Respuesta ("chmod",true);
		Respuesta r438 = new Respuesta ("passwd",false);
		Respuesta []a111={r435,r436,r437,r438};
		
		Respuesta r439 = new Respuesta ("Administraciones públicas y empresas privadas",true);
		Respuesta r440 = new Respuesta ("Empleadores activos y empleadores inactivos",false);
		Respuesta r441 = new Respuesta ("Empleadores ocupados y empleadores activos",false);
		Respuesta r442 = new Respuesta ("Empleadores activos y empresas privadas",false);
		Respuesta []a112={r439,r440,r441,r442};
		
		Respuesta r443 = new Respuesta ("Activos e inactivos",false);
		Respuesta r444 = new Respuesta ("Activos y ocupados",false);
		Respuesta r445 = new Respuesta ("Activos y total de la población",false);
		Respuesta r446 = new Respuesta ("Activos y mayores de 16 años",true);
		Respuesta []a113={r443,r444,r445,r446};
		
		Respuesta r447 = new Respuesta ("Ploteus",false);
		Respuesta r448 = new Respuesta ("ECVET",false);
		Respuesta r449 = new Respuesta ("EQAVET",true);
		Respuesta r450 = new Respuesta ("EQF",false);
		Respuesta []a114={r447,r448,r449,r450};
		
		Respuesta r451 = new Respuesta ("Sólo se fijan en objetivos a corto plazo",false);
		Respuesta r452 = new Respuesta ("Es susceptible de modificarse",false);
		Respuesta r453 = new Respuesta ("Está basado en datos rigurosos y fiables",true);
		Respuesta r454 = new Respuesta ("Las tres respuestas son correctas",false);
		Respuesta []a115={r451,r452,r453,r454};
		
		Respuesta r455 = new Respuesta ("No asumir riesgos",false);
		Respuesta r456 = new Respuesta ("Autonomía e independencia",true);
		Respuesta r457 = new Respuesta ("Seguridad en el empleo",false);
		Respuesta r458 = new Respuesta ("Movilidad",false);
		Respuesta []a116={r455,r456,r457,r458};
		
		Respuesta r459 = new Respuesta ("Redactarse utilizando palabras técnicas",false);
		Respuesta r460 = new Respuesta ("Ir firmado",true);
		Respuesta r461 = new Respuesta ("Redactarse utilizando el ordenador",false);
		Respuesta r462 = new Respuesta ("Redactarse en primera persona",false);
		Respuesta []a117={r459,r460,r461,r462};
		
		Respuesta r463 = new Respuesta ("Facilitar la movilidad laboral y formativa a través de los países miembros de la UE",true);
		Respuesta r464 = new Respuesta ("Buscar empleo en Europa",false);
		Respuesta r465 = new Respuesta ("Redactar un CV a nivel europeo",false);
		Respuesta r466 = new Respuesta ("Obtener el título superior de FP",false);
		Respuesta []a118={r463,r464,r465,r466};
		
		Respuesta r467 = new Respuesta ("La identidad, la continuidad y la autoridad compartida",false);
		Respuesta r468 = new Respuesta ("La identidad, la colectividad y la autoridad compartida",false);
		Respuesta r469 = new Respuesta ("La identidad, la continuidad y la colectividad",true);
		Respuesta r470 = new Respuesta ("La continuidad, la colectividad y la autoridad compartida",false);
		Respuesta []a119={r467,r468,r469,r470};
		
		Respuesta r471 = new Respuesta ("La responsabilidad compartida, la especialización y los objetivos comunes",true);
		Respuesta r472 = new Respuesta ("La responsabilidad compartida, la permanencia y los objetivos comunes",false);
		Respuesta r473 = new Respuesta ("La responsabilidad compartida, la especialización y la permanencia",false);
		Respuesta r474 = new Respuesta ("La permanencia, la especialización y los objetivos comunes",false);
		Respuesta []a120={r471,r472,r473,r474};
		
		Respuesta r475 = new Respuesta ("El escaso reconocimiento",false);
		Respuesta r476 = new Respuesta ("El clima laboral",false);
		Respuesta r477 = new Respuesta ("La desmotivación",true);
		Respuesta r478 = new Respuesta ("La excesiva complejidad",false);
		Respuesta []a121={r475,r476,r477,r477};

	
	
	 //ENUNCIADOS DE LAS PREGUNTAS
	// CREAMOS OBJETOS TIPO ACTIVIDADES, A LAS QUE LE PASAMOS LOS ENUNCIADOS, SU TIPO Y SUS RESPECTIVAS REPUESTAS
	Actividades e1 = new Actividades("¿Cuándo acabó la segunda guerra mundial?", 0, a1);
	Actividades e2 = new Actividades("¿Cuál es el río más largo del mundo?", 0, a2);
	Actividades e3 = new Actividades("¿Quién es el autor de El Quijote?", 0, a3);
	Actividades e4 = new Actividades("¿Quién pintó “La última cena”?", 0, a4);
	Actividades e5 = new Actividades("¿Dónde se encuentra la Sagrada Familia?", 0, a5);
	Actividades e6 = new Actividades("¿Cúal es el océano más grande?", 0, a6);
	Actividades e7 = new Actividades("¿Quá deporte practicaba Michael Jordan?", 0, a7);
	Actividades e8 = new Actividades("¿Cuál es el planeta más grande del Sistema Solar?", 0, a8);
	Actividades e9 = new Actividades("¿Cuál es la moneda de Reino Unido?", 0, a9);
	Actividades e10 = new Actividades("¿Cuál es el animal terrestre más rápido del mundo?", 0, a10);
	Actividades e11 = new Actividades("¿Quién ganó el mundial de fútbol de 2014?", 0, a11);
	Actividades e12 = new Actividades("¿Cuánto vale el número pi?", 0, a12);
	Actividades e13 = new Actividades("¿Cómo se llama al triángulo que tiene sus tres lados iguales?", 0, a13);
	Actividades e14 = new Actividades("¿Cúal es el metal precioso más caro del mundo?", 0, a14);
	Actividades e15 = new Actividades("¿Cuántos corazones tiene un pulpo?", 0, a15);
	Actividades e16 = new Actividades("¿Cúal es el río más caudaloso del mundo?", 0, a16);
	Actividades e17 = new Actividades("¿Cuál es la capital de Australia?", 0, a17);
	Actividades e18 = new Actividades("¿Cuál es la serpiente más larga del mundo?", 0, a18);
	Actividades e19 = new Actividades("¿Cuál es el río más largo de España?", 0, a19);
	Actividades e20 = new Actividades("¿Cuál es el país más grande del mundo?", 0, a20);
	Actividades e21 = new Actividades("¿Cuál es la capital de Suecia?", 0, a21);	
	Actividades e22 = new Actividades("El gentilicio de la provincia de León:", 0, a22);
	Actividades e23 = new Actividades("¿En qué consiste la hipérbole?", 0, a23);
	Actividades e24 = new Actividades("¿Qué tipo de palabra es la palabra \"más\"?", 0, a24);
	Actividades e25 = new Actividades("¿En qué año es nombrado Juan Carlos I Rey de España?", 0, a25);
	Actividades e26 = new Actividades("¿Cómo se llama el cambio de dirección que experimenta la luz al pasar de un medio a otro?", 0, a26);
	Actividades e27 = new Actividades("El gentilicio de la provincia de Albacete es:", 0, a27);
	Actividades e28 = new Actividades("¿Cuántos grados tiene un ángulo agudo?", 0, a28);
	Actividades e29 = new Actividades("¿A qué estilo arquitectónico pertenece la catedral de Notre Damme de Paris?", 0, a29);
	Actividades e30 = new Actividades("La ley de la gravitación universal fue descrita por:", 0, a30);
	Actividades e31 = new Actividades("¿Cuál es la característica principal de la Edad de los Metales?", 0, a31);
	Actividades e32 = new Actividades("¿Qué nombre recibieron las guerras entre Roma y Cartago?", 0, a32);
	Actividades e33 = new Actividades("El volcán Etna se encuentra en:", 0, a33);
	Actividades e34 = new Actividades("¿Quién pintó \"Las Meninas\"?", 0, a34);
	Actividades e35 = new Actividades("¿Cúal es el primer uso que tuvo el ferrocarril a principios del siglo XIX?", 0, a35);
	Actividades e36 = new Actividades("El paso de un sólido al estado líquido mediante calor se denomina:", 0, a36);
	Actividades e37 = new Actividades("¿Cuál de las siguientes es considerada la mayor batalla marítima de la historia?", 0, a37);
	Actividades e38 = new Actividades("El paso del estado de la materia que se encuentra en forma gaseosa a forma líquida se denomina:", 0, a38);
	Actividades e39 = new Actividades("Cuánta sangre tiene el cuerpo humano", 0, a39);	
	Actividades e40 = new Actividades("¿De qué estilo arquitectónico es la catedral de Sevilla?", 0, a40);
	Actividades e41 = new Actividades("¿Cuál fue la primera civilización histórica?", 0, a41);
	Actividades e42 = new Actividades("¿Cuándo tuvo lugar la caída del Muro de Berlín?", 0, a42);
	Actividades e43 = new Actividades("¿Quién descubrió la penicilina?", 0, a43);
	Actividades e44 = new Actividades("Según las Leyes de Kepler, ¿cómo son las órbitas de los planetas alrededor del Sol?", 0, a44);
	Actividades e45 = new Actividades("La capital de Galicia es:", 0, a45);
	Actividades e46 = new Actividades("¿Cuál es la unidad estructural de todos los organismos?", 0, a46);
	Actividades e47 = new Actividades("La capital de Corea del Sur es:", 0, a47);
	Actividades e48 = new Actividades("El equinoccio de otoño tiene lugar:", 0, a48);	
	Actividades e49 = new Actividades("¿Cuál es el río europeo que atraviesa un mayor número de países?", 0, a49);
	Actividades e50 = new Actividades("¿Cómo se reproduce una estrella de mar?", 0, a50);
	Actividades e51 = new Actividades("¿Cuál es el elemento químico cuyo símbolo es Pb", 0, a51);
	Actividades e52 = new Actividades("El orden de los elementos en la tabla periódica tiene en cuenta:", 0, a52);
	Actividades e53 = new Actividades("¿C¿Qué es una acacia??", 0, a53);
	Actividades e54 = new Actividades("La capa exterior del cuerpo humano se llama:", 0, a54);
	Actividades e55 = new Actividades("¿Cómo puede ser la rima?", 0, a55);
	Actividades e56 = new Actividades("¿En qué año entró el Euro como moneda única europea?", 0, a56);
	Actividades e57 = new Actividades("¿Cuántos lados tiene un icosaedro regular?", 0, a57);
	Actividades e58 = new Actividades("La estructura de un cuarteto es", 0, a58);
	Actividades e59 = new Actividades("El intestino delgado tiene una longitud aproximada de:", 0, a59);
	Actividades e60 = new Actividades("La intensidad de corriente eléctrica se mide utilizando:", 0, a60);
	Actividades e61 = new Actividades("¿Qué sentido tiene siempre la fuerza de rozamiento?", 0, a61);
	
	
	//ENUNCIADOS DE LOS RETOS
	Actividades e62 = new Actividades("¿Cúal de las siguientes claves no existe?(Base de Datos)", 1, a62);
	
	Actividades e63 = new Actividades("¿Cuál no es una restricción de actualización y eliminación?(Base de Datos)", 1, a63);
	Actividades e64 = new Actividades("Selecciona los sinónimos correctos:(Base de Datos)", 1, a64);
	Actividades e65 = new Actividades("¿Cuál de estos objetivos no es del modelo Realacional?(Base de datos)", 1, a65);
	Actividades e66 = new Actividades("Selecciona cual de estas opciones es una restricción semántica del modelo relacional:(Base de Datos)", 1, a66);
	Actividades e67 = new Actividades("Una restricción semántica es:(Base de Datos)", 1, a67);
	Actividades e68 = new Actividades("¿Qué diferencia hay entre disparadores y triggers?(Base de Datos)", 1, a68);
	Actividades e69 = new Actividades("¿Qué es una clave primaria?(Base de Datos)", 1, a69);
	Actividades e70 = new Actividades("¿Cuál de las siguientes NO es un tipo de restricción semántica?(Base de Datos)", 1, a70);
	
	Actividades e71 = new Actividades("Las tablas pueden ser según su tipo:(Base de Datos)", 1, a71);
	Actividades e72 = new Actividades("¿Qué característica no es verdadera en un sprint?(Entornos de Desarrollo)", 1, a72);
	Actividades e73 = new Actividades("¿Qué es un código objeto?(Entornos de desarrollo)", 1, a73);
	Actividades e74 = new Actividades("¿Cuáles son los dos tipos de documentación que hay?(Entornos de Desarrollo)", 1, a74);
	Actividades e75 = new Actividades("Las metodologías ágiles se basan en:(Entornos de desarrollo)", 1, a75);
	Actividades e76 = new Actividades("¿Cuál es la mayor fuente de errores de C++?(Entornos de desarrollo)", 1, a76);
	Actividades e77 = new Actividades("¿Para qué sirve git pull?(Entornos de desarrollo)", 1, a77);
	Actividades e78 = new Actividades("¿Cómo añadimos un comentario además de confirmar los cambios?(Entornos de desarrollo)", 1, a78);
	Actividades e79 = new Actividades("¿Cuál es el comando para comprobar el estado del repositorio?(Entornos de desarrollo)", 1, a79);	
	Actividades e80 = new Actividades("¿Para qué sirve el comando de git remote add origin?(Entornos de desarrollo)", 1, a80);
	
	Actividades e81 = new Actividades("¿Qué hace la operación git log?(Entornos de desarrollo)", 1, a81);
	Actividades e82 = new Actividades("¿Qué hace el operador = en Java?(Programación)", 1, a82);
	Actividades e83 = new Actividades("¿Qué es el identificador de una variable?(Programación)", 1, a83);
	Actividades e84 = new Actividades("¿Cuál es la forma correcta de declarar una variable?(Programación)", 1, a84);
	Actividades e85 = new Actividades(" Un bucle es:(Programación)", 1, a85);
	Actividades e86 = new Actividades("Una sentencia if…(Programación)", 1, a86);
	
	Actividades e87 = new Actividades("Canta en voz alta una parte de algún villancico que conozcas", 1, a87);
	Actividades e88 = new Actividades("Pronuncia el siguiente trabalenguas: Si al pronunciar te trabas con las palabras, "
	+ "practica con trabalenguas, porque trabalenguando, trabalenguando, te irás destrabalenduando.", 1, a88);	
	Actividades e89 = new Actividades("Dibuja en la pizarra al profesor que peor te caiga", 1, a89);
	Actividades e90 = new Actividades("Da una vuelta a la clase a pata coja", 1, a90);
	Actividades e91 = new Actividades("Haz una bola de papel y  trata de encestarla a la primera en la papelera desde tu sitio", 1, a91);
	
	Actividades e92 = new Actividades("¿Qué etiqueta se usa para poner enlaces?(Lenguaje de marcas)", 1, a92);
	Actividades e93 = new Actividades("¿Qué etiqueta se usa para crear una lista ordenada?(Lenguaje de marcas)", 1, a93);
	Actividades e94 = new Actividades("¿Qué etiqueta se usa para crear una lista desordenada?(Lenguaje de marcas)", 1, a94);
	Actividades e95 = new Actividades("¿Qué etiqueta se usa para hacer un salto de línea simple?(Lenguaje de marcas)", 1, a95);
	Actividades e96 = new Actividades("¿Qué etiqueta se usa para convertir el texto en negrita?(Lenguaje de marcas)", 1, a96);
	Actividades e97 = new Actividades("¿Qué etiqueta se usa para convertir el texto en cursiva?(Lenguaje de marcas)", 1, a97);
	Actividades e98 = new Actividades("¿Qué sintaxis se usa para declarar el estilo del tipo de letra de un texto?(Lenguaje de marcas)", 1, a98);
	Actividades e99 = new Actividades("¿Qué sintaxis se usa para visualizar un texto normal en mayúsculas versales?(Lenguaje de marcas)", 1, a99);
	
	Actividades e100 = new Actividades("¿Qué sintaxis se usa para cambiar el tamaño de la letra?(Lenguaje de marcas)", 1, a100);
	Actividades e101 = new Actividades("¿Qué propiedad se utiliza para poner los bordes redondeados?(Lenguaje de marcas)", 1, a101);
	Actividades e102 = new Actividades("Si quiero tener un ordenador con 2 microprocesadores…(Sistemas informáticos)", 1, a102);
	Actividades e103 = new Actividades("¿Cuál de los siguientes elementos no forma parte de la máquina de Turing?(Sistemas informáticos)", 1, a103);
	Actividades e104 = new Actividades("¿Cuál de las siguientes memorias no se encuentran integradas en el procesador?(Sistemas informáticos)", 1, a104);
	Actividades e105 = new Actividades("¿Cuál es una ventaja de las Unidades de Estado Sólido frente a los Discos Duros?(Sistemas informáticos)", 1, a105);
	Actividades e106 = new Actividades("Al listar de forma detallada el contenido de un directorio en Linux, ¿qué diferencia a los archivos de los directorios?(Sistemas informáticos)", 1, a106);
	Actividades e107 = new Actividades("¿Con qué opción del comando wc podemos contar el tamaño en KBytes de un fichero?(Sistemas informáticos)", 1, a107);
	Actividades e108 = new Actividades("¿Qué comando nos permite iniciar sesión como usuario root en el terminal?(Sistemas informáticos)", 1, a108);
	Actividades e109 = new Actividades("¿Con qué comando podemos cambiar la contraseña de un usuario?(Sistemas informáticos)", 1, a109);
	Actividades e110 = new Actividades("¿Con qué comando podemos meter a un usuario en un grupo?(Sistemas informáticos)", 1, a110);
	Actividades e111 = new Actividades("¿Con qué comando podemos dar permisos a un usuario sobre un fichero?(Sistemas informáticos)", 1, a111);
	Actividades e112 = new Actividades("Los empleadores están clasificados en…(FOL)", 1, a112);
	Actividades e113 = new Actividades("La tasa de actividad se define como la relación entre:(FOL)", 1, a113);
	Actividades e114 = new Actividades("El marco común de garantía de calidad de la FP en la UE se denomina:(FOL)", 1, a114);
	Actividades e115 = new Actividades("¿Qué significa que un proyecto profesional sea realista?(FOL)", 1, a115);
	Actividades e116 = new Actividades("Una ventaja de trabajar por cuenta propia es…:(FOL)", 1, a116);
	Actividades e117 = new Actividades("Un currículum vitae no debe:(FOL)", 1, a117);
	Actividades e118 = new Actividades("El sistema Europass sirve para: (FOL)", 1, a118);
	Actividades e119 = new Actividades("Son condiciones mínimas que se deben dar en un grupo:(FOL)", 1, a119);
	Actividades e120 = new Actividades("Son características de un equipo de trabajo:(FOL)", 1, a120);
	Actividades e121 = new Actividades("En un equipo de trabajo, es una causa de fracaso:(FOL)", 1, a121);

	
	
	
	//TIPO 0 INDICA QUE SON ACTVIDADES TIPO PREGUNTAS
	Actividades [] tipo0 = {e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18,e19,e20,e21,e22,e23,e24,e25,e26,e27,e28,e29,e30,
			e31,e32,e33,e34,e35,e36,e37,e38,e39,e40,e41,e42,e43,e44,e45,e46,e47,e48,e49,e50,e51,e52,e53,e54,e55,e56,e57,e58,e59,e50,
			e51,e52,e53,e54,e55,e56,e57,e58,e59,e60,e61};
	
	//TIPO 1 INDICA QUE SON ACTVIDADES TIPO RETOS
	Actividades [] tipo1 = {e62,e63,e64,e65,e66,e67,e68,e69,e70,e71,e72,e73,e74,e75,e76,e77,e78,e79,e80,e81,e82,e83,e84,e85,e86,e87,e88,e89,e90,
			e91,e92,e93,e94,e95,e96,e97,e98,e99,e100,e101, e102,e103,e104,e105,e106,e107,e108,e109,e110,e111,e112,e113,e114,e115,e116,e117,e118,e119,
			e120,e121};

	public Actividades[] obtenerPreguntas() {
		return tipo0;
	}
	
	public Actividades[] obtenerRetos() {
		return tipo1;
	}

}