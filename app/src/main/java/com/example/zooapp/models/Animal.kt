package com.example.zooapp.models

import com.example.zooapp.R

data class Animal (
    val id: Int,
    val name: String,
    val species: String,
    val imageRes: Int,
    val description: String,
    val curiosities: String,
    var isFavorite: Boolean = false
)

val animalList = listOf(
    Animal(
        id = 1,
        name = "Cavalo",
        species = "Equus ferus",
        imageRes = R.drawable.horse,
        description = "O cavalo evoluiu há entre 45 milhões a 55 milhões de anos, desde uma pequena criatura com vários dedos, o Eohippus, até o animal grande e com um único dedo de hoje.",
        curiosities = "Uma curiosidade engraçada é que podem mover suas orelhas em 180 graus, isso porque a orelha do animal é composta por 16 músculos cada uma."
    ),
    Animal(
        id = 2,
        name = "Gato",
        species = "Felis catus",
        imageRes = R.drawable.catnip,
        description = "O gato doméstico é conhecido por sua agilidade e independência.",
        curiosities = "Gatos passam cerca de 70% do dia dormindo."
    ),
    Animal(
        id = 3,
        name = "Cachorro",
        species = "Canis lupus familiaris",
        imageRes = R.drawable.dog,
        description = "Os cães são conhecidos como os melhores amigos do homem e possuem uma relação histórica com os humanos que remonta a milhares de anos.",
        curiosities = "O nariz dos cães tem uma impressão única, assim como nossas digitais."
    ),
    Animal(
        id = 4,
        name = "Tigre",
        species = "Panthera tigris",
        imageRes = R.drawable.tiger,
        description = "Os tigres são os maiores membros da família dos felinos e são conhecidos por suas listras únicas.",
        curiosities = "As listras de um tigre são como impressões digitais – nenhuma é igual à outra."
    ),
    Animal(
        id = 5,
        name = "Elefante",
        species = "Loxodonta africana",
        imageRes = R.drawable.elephant,
        description = "Os elefantes são os maiores animais terrestres vivos e são conhecidos por sua inteligência e memória impressionantes.",
        curiosities = "A tromba de um elefante tem mais de 40.000 músculos diferentes."
    ),
    Animal(
        id = 6,
        name = "Golfinho",
        species = "Delphinidae",
        imageRes = R.drawable.dolphin,
        description = "Os golfinhos são mamíferos aquáticos extremamente inteligentes e sociáveis.",
        curiosities = "Os golfinhos têm nomes únicos para se identificarem uns aos outros."
    ),
    Animal(
        id = 7,
        name = "Pinguim",
        species = "Spheniscidae",
        imageRes = R.drawable.penguin,
        description = "Os pinguins são aves aquáticas que não voam, conhecidas por seu andar engraçado e hábitos sociais.",
        curiosities = "Os pinguins imperadores podem mergulhar a mais de 500 metros de profundidade."
    ),
)


