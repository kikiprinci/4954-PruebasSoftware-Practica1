# 4954-PruebasSoftware-Practica1

## Pruebas de Software 
### Practica 1
* Fecha de entrega: 28/10/2019
* Integrante:
  * Fran Arboleya
  
## Branchs
* Master: 
    * informacion en el readme
   
## Diagrama MasterMind

<p align="center">
  <img alt="" src="https://plantuml-server.kkeisuke.app/svg/ZLLDJyCm3BtdLqJZCZvMCKv883GOY0j84o3kKHjDbTfaf2q33VuxiTCcgTi1kypnyxCTzxbTLBKmTLCMpFxIGbGLVn3LhIX5nNVic6yAyJazPD_CUuzccTwgsHL_qEiy7V6_vdBRvG8Ry-IgbaQazNIfLQrDKKW3MTkmPsW2Om-q4Mej-no4WMWq8QviUyWR9wuAYuyIdsJLbF8NgWiWtD1dabnnqXRppG2uwbLcKJr0QNR64F8pz8M8loj1t25xrA97RxGm6OA-mn7CM-vkRuqmRKPlkelbCdK0yxxhD9MRU1ITb40YCDQrZ52d9u1i7t1PMLMvLgpzTyvxKSg-nzwibfxNzh-lSl3imaEdmGY58x_yScc7MQaZX58Hx8yaYXWBUTJlye-GfL2fBFvLS22oA4Zx6SShE3grVbCHG5lPqVKQXVfZ076Kje1zBsYJvSe-OgvDlixL2OzSjZaheSCBcwRFH_c5GDPVmXZeTD5vi2MIpCjgCELzWUI9TMLWib00_ico4TzBOvHsFkZupXZjHOpna0QDm9cSVvnFsXKTOFCaEVkOdqtSehRm8BKZGsvdSGw2c9mcoRnZjW3ktb8NWOimKD6812xj4XCVV1jQNqZ4VIRBYAG1mR6-83OwuwZWZCP8O_Y6Y0XuOpmlfChiH-u7.svg">
</p>

### PlantUML
 
 ```PlantUML
@startuml



class LasDamas {
+ play()
}
LasDamas *-down-> Logic
LasDamas *-down-> View

class View {
+ interact(Contorller)
}

class StartView #orange {
+ interact(StartController)
}

class PlayView  #orange {
+ interact(PllayController)
}

class ResumeView  #orange {
+ interact(ResumeController)
}

StartView ..> StartController
PlayView ..> PlayController
ResumeView ..> ResumeController

View *-down-> StartView
View *-down-> PlayView
View *-down-> ResumeView
StartView *-down-> BoardView
PlayView *-down-> BoardView
BoardView ..> SquareView
SquareView ..> PieceView

View ..> AcceptController

class Logic{
+ getController()
}
Logic *--> Session
Session *--> Game
Session *--> State
Logic *-down-> AcceptController

class Controller{
}

class AcceptController{
}

Controller <|-down- AcceptController
AcceptController <|-down- StartController
AcceptController <|-down- PlayController
Controller <|-down- MoveController
Controller <|-down- CancelController
AcceptController <|-down- ResumeController
Controller o--> Game

class StartController{
}

class MoveController{
}

class CancelController{
}

class ResumeController{
}

class PlayController{
+ move(Coordinate origin, Coordinate target);
}
PlayController ..> Coordinate

PlayView ..> Coordinate

class Coordinate{
}

PlayController *-down-> CancelController
PlayController *-down-> MoveController


class Game{
}
Game *-down-> Board
Game *-down-> Turno
Game ..> Error

class Board{
}
Board *-down-> "8x8" Square
Board *-down-> "1..2x12" Piece
Board ..> Error

class Square{
}
Square  --> "0..1" Piece
Square *--> Color

class Piece{
}
Piece <|-down- Peon
Piece <|-down- Dama
Piece *--> Color 

class Peon{
}

class Dama{
}

class Color{
}

class Turno{
}
Turno *--> Color

class State{
}

class Error{
}

@enduml
```
