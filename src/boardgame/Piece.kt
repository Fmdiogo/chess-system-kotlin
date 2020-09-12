package boardgame

class Piece{
    protected var position:Position?=null
    private var board:Board
    //protected get -> Não acho que é possivel deixar um getter protected no kotlin


    constructor(board: Board){
        this.board = board
        this.position = null

    }
}