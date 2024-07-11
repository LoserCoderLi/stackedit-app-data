public class MiGong{

	public static void main(String[] args){
		// 思路
		// 1. 先创建迷宫 用二维数组表示 int map[][] = new int[8][7]
		// 2. 规定 map数组中 0为可以走 1为障碍物

		int map[][] = new int[8][7];
		// 3. 绘制地图
		for(int i = 0;i<map.length;i++){
			map[i][0] = 1;
			map[i][map[i].length-1] = 1;

			for(int j = 0;j<map[i].length;j++){
				map[0][j] = 1;
				map[map.length-1][j] = 1;
			}

		}
		map[3][1] = 1;
		map[3][2] = 1;
		map[4][2] = 1;
		map[4][3] = 1;
		map[4][4] = 1;
		map[3][4] = 1;
		map[2][4] = 1;



		// 显示地图
		for(int i = 0;i<map.length;i++){
			for(int j = 0;j<map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println("");
		}

		// 测试开始
		// 实例化
		T myT = new T();
		// 判断
		if(myT.findWay(map, 1, 1)){
			System.out.println("找到路了");
		}
		// 打印路径地图
		for(int i = 0;i<map.length;i++){
			for(int j = 0;j<map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println("");
		}
		

	}
}

class T{

	// 递归回溯的思想解决老鼠出迷宫
	// 1. findWay 专门用来找出迷宫的路径
	// 2. 如果找到 返回true 反之 返回false
	// 3. map 就是二维数组 表示迷宫地图
	// 4. i，j就是表示小鼠的位置 初始（1，1）
	// 5. 规定map中 0：可以走 1：障碍 2：走过的标记 3：走过，但是不通
	// 6. 判断当map[6][5] == 2 时，表示找到出路
	// 7. 老鼠找路策略 下->右->上->左

	public boolean findWay(int[][] map, int i, int j){

		if(map[6][5] == 2){// 找到出路
			return true;
		}
		else{

			if(map[i][j] == 0){// 可以走

				// 假设可以走通
				map[i][j] = 2;
				// 根据策略判断是否能走通
				if(findWay(map, i+1, j)){ //下
					return true;
				}
				else if (findWay(map, i, j+1)) { //右
					return true;
				}
				else if (findWay(map, i-1, j)) { //上
					return true;
				}
				else if (findWay(map, i, j-1)) { //左
					return true;
				}
				else{
					map[i][j] = 3;
					return false;
				}

			}
			else{// 1 2 3 1：障碍不能走 2：走过不用再测试了 3：走不通
				return false;
			}

		}

	}
}