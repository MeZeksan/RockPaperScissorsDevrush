package ru.zeksan.rockpaperscissors

fun main() {

    var computerChoice = ""
    println("Rock, Paper or Scissors?")
    var playerChoice = readln().lowercase()
    while(playerChoice != "rock" && playerChoice != "scissors" && playerChoice != "Paper"){
       println("We need correct answer")
        playerChoice = readln().lowercase()
    }

    val randomNumber = (1..3).random()

    computerChoice = when (randomNumber) {
        1 -> {
            "Rock"
        }

        2 -> {
            "Paper"
        }

        else -> {
            "Scissors"
        }
    }.lowercase()
    println(computerChoice)

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "rock" && computerChoice == "scissors" -> "Player"
        playerChoice == "paper" && computerChoice == "rock" -> "Player"
        playerChoice == "scissors" && computerChoice == "paper" -> "Player"
        else -> "Computer"
    }

    if(winner == "Tie"){
        println("Its a $winner")
    }
    else{
        println("$winner won")
    }
}