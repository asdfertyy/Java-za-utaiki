public class Game
{

// ----------------------------------------------------------------------
// Part a: the score message


  public String getScoreMessage()
  {
    return "A message";
  } // getScoreMessage


  public void setScoreMessage(String message)
  {
  } // setScoreMessage


  public String getAuthor()
  {
    return "Mr. and Mrs. Nobody";
  } // getAuthor


// ----------------------------------------------------------------------
// Part b: constructor and grid accessors


  public Game(int requiredGridSize)
  {
  } // Game


  public int getGridSize()
  {
    return 8;
  } // getGridSize


  public Cell getGridCell(int x, int y)
  {
    return null;
  } // getGridCell


// ----------------------------------------------------------------------
// Part c: initial game state

// Part c-1: setInitialGameState method

  public void setInitialGameState(int requiredTailX, int requiredTailY,
                                  int requiredLength, int requiredDirection)
  {
  } // setInitialGameState


// ----------------------------------------------------------------------
// Part c-2 place food


// ----------------------------------------------------------------------
// Part c-3: place snake


// ----------------------------------------------------------------------
// Part d: set snake direction


  public void setSnakeDirection(int requiredDirection)
  {
  } // setSnakeDirection


// ----------------------------------------------------------------------
// Part e: snake movement

// Part e-1: move method


  public void move(int moveValue)
  {
  } // move


// ----------------------------------------------------------------------
// Part e-2: move the snake head


// ----------------------------------------------------------------------
// Part e-3: move the snake tail


// ----------------------------------------------------------------------
// Part e-4: check for and deal with crashes


// ----------------------------------------------------------------------
// Part e-5: eat the food


  public int getScore()
  {
    return 99999999;
  } // getScore


// ----------------------------------------------------------------------
// Part f: cheat


  public void cheat()
  {
  } // cheat


// ----------------------------------------------------------------------
// Part g: trees


  public void toggleTrees()
  {
  } // toggleTrees


// ----------------------------------------------------------------------
// Part h: crash countdown


// ----------------------------------------------------------------------
// Part i: optional extras


  public String optionalExtras()
  {
    return "  No optional extras defined\n";
  } // optionalExtras


  public void optionalExtraInterface(char c)
  {
    if (c > ' ' && c <= '~')
      setScoreMessage("Key " + new Character(c).toString()
                      + " is unrecognised (try h)");
  } // optionalExtraInterface

} // class Game
