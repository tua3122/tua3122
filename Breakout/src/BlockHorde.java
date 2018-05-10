import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class BlockHorde
{
	private List<Block> blocks;
	private Graphics win;

	public BlockHorde()
	{
		blocks = new ArrayList<Block>();
		for(int x = 10; x < 700; x+=85){
			add(new Block(x,10, 75, 30));
			add(new Block(x,480, 75, 30));
		}
		for(int y = 50; y < 400; y+=85){
			add(new Block(10,y, 30, 75));
			add(new Block(735,y, 30, 75));
		}
		
		for(int x = 50; x < 665; x+=85){
			add(new Block(x,45, 75, 30));
			add(new Block(x,445, 75, 30));
		}
		for(int y = 85; y < 370; y+=90){
			add(new Block(50,y, 30, 80));
			add(new Block(690,y, 30, 80));
		}
	}

	public void add(Block al)
	{
		blocks.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		win = window;
		for(int i = 0; i < blocks.size(); i++){
			blocks.get(i).draw(window);
		}
		
	}

	public int removeDeadOnes(Ball ball)
	{
		int x = 0;
		for(int i = 0; i < blocks.size(); i ++){
			if(ball.getX()>=blocks.get(i).getX()&&ball.getX()<=blocks.get(i).getX()+blocks.get(i).getWidth()){
				if(ball.getY()>=blocks.get(i).getY()&&ball.getY()<=blocks.get(i).getY()+blocks.get(i).getHeight()){
					win.setColor(Color.WHITE);
					win.fillRect(blocks.get(i).getX(), blocks.get(i).getY(), blocks.get(i).getWidth(), blocks.get(i).getHeight());
					if(blocks.get(i).getHeight()<75){
						x = 1;
					}
					if(blocks.get(i).getHeight()>=75){
						x = 2;
					}
					blocks.remove(i);
				}
			}
		}
		return x;
	}
	
	public int getSize(){
		return blocks.size();
	}
}
