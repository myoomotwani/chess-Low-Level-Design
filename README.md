# chess Simulator Low level design 
# Description of the project
This  project is a low level design to simulate a sequence of chess moves. For each move , the program is expected to 

--> Make a move if the move is valid <br />
--> Skip the move if the move is invalid.


# Rules
The rules and description of the game can be referred from this link. https://workat.tech/machine-coding/practice/design-chess-validator-to77d8oqpx2h <br />
Pasting the rules below as well for convenience. 

Let's look at the game of Chess. Chess is a two-player strategy game played on an 8*8 checkered board.

![Chess_Init](https://user-images.githubusercontent.com/13993416/208284486-357ca3a0-0c5c-4786-b092-004b5b4cb678.png)

The game is played between two players. One player controls an army of white pieces and the other controls the army of black pieces.
Each army includes the following pieces: 1 King, 1 Queen, 2 Knights, 2 Rooks, 2 Bishops, 8 Pawns
Each piece has its own way of moving on the board.
A player may move only to an empty cell unless it is trying to capture a piece of the other player.
A piece is captured when a player moves to a position currently occupied by a piece of the opponent.
Each player needs to move a piece in each turn.
The game starts with the player owning the white pieces making the first move. After this, the players play alternate turns.
There are more rules but it is outside the scope of this problem.
Piece Moves
Let's look at all the valid moves of the different types of pieces.

###  Pawn
A pawn can move to a cell which is one step immediately in front of it.
If it is the first move of that pawn, it can move two positions to a cell in front. Both the cells in front of it needs to be unoccupied.
 It can also move one step diagonally in front while capturing a piece of the opponent. The capture cannot happen without moving diagonally.
 
###   Knight
A knight moves in an 'L' shape, i.e., two steps horizontally and one step vertically or two steps vertically and one step horizontally.
The knight can leap over other pieces to land directly on the destination cell.

###  Rook
A rook can move any number of steps either horizontally or vertically without leaping over any other piece.

###  Bishop
A bishop can move any number of steps diagonally without leaping over any other piece.

###  Queen
A queen can move any number of steps in any direction (horizontally, vertically, or diagonally) without leaping over any other piece.

###  King
A king can move one step in any direction (horizontally, vertically, or diagonally).

# Board Representation
The chess board is represented in form of a 2d array. <br />  
String[][] board = new String[8][8];

each piece is denoted in form of a two letter string. For e.g "BR". The first letter represents the color of player. Second letter denotes the piece. In this case rook.<br />
BR -> B = Black R = Rook

The  position of a piece on board is assigned using below expression  <br />
board[0][0] =  "BR";

The empty blocks are represented using two hyphens <br />
board[3][0] =  "--";

W and B represents a white and black piece respectively  <br />
P => Pawn  <br />
R => Rook  <br />
N => Knight  <br />
B => Bishop  <br />
Q => Queen  <br />
K => King  <br />
An empty cell is represented by two hyphens (--).  <br />

# Moves representation
Each move looks like below
e2 e4 <br /> 
The above move denotes --> Attempt a move from e4 to e2. If the move is valid , the board positions should change. Else , we should print an error message.
<br /> 
In the imput we will have multiple lines with each line containing the Start Position End Position. Both the positions will be separated by a space.

makeAMove( new String[]{ "a2" , "a4"} );<br />
makeAMove( new String[]{ "a7" , "a6"} );<br />
makeAMove( new String[]{ "a4" , "a5"} );<br />




