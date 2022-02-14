# rock - paper == paper, rock - scissor == rock, paper - scissor = scissor,  

import random

hands = ['rock', 'paper', 'scissor']

class Game:
    
    def __init__(self):
        self.player1 = random.choice(hands)
        self.player2 = random.choice(hands)

    def result(self):

        print(f'Player one: {self.player1} and player two: {self.player2}')

        if (self.player1 == self.player2):
            return "Its a draw!"
        
        elif (self.player1 and self.player2) in ['rock', 'paper']:
            return "player 1 wins" if self.player1 == 'paper' else "player 2 wins"

        elif (self.player1 and self.player2) in ['rock', 'scissor']:
            return "player 1 wins" if self.player1 == 'rock' else "player 2 wins"

        elif (self.player1 and self.player2) in ['paper', 'scissor']:
            return "player 1 wins" if self.player1 == 'scissor' else "player 2 wins"

            

game = Game()
print(game.result())