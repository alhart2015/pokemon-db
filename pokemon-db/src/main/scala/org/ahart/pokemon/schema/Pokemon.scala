package org.ahart.pokemon.schema

case class Pokemon(
                  name: String,
                  id: Int,
                  type1: PokemonType,
                  type2: PokemonType
                  )
