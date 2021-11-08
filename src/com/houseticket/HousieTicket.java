package com.houseticket;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HousieTicket {
	int col1, col2, col3, col4, col5, col6, col7, col8, col9 = 0;
	static int row = 0;
	int row1, row2, row3 = 0;
	int inputCount = 0;
	static Set<Integer> set = new HashSet<Integer>();

	public void fillRowColumn(int num, int rowcol[][]) {
		try {
			if (num >= 1 && num <= 10) {
				int column1 = 0;
				if (col1 == 2) {
					System.out.println("Maximum Entry between 1 to 10");
				} else {
					if (rowcol[0][column1] == 0 && row1 < 5) {
						rowcol[0][column1] = num;
						row1++;
					} else if (rowcol[2][column1] == 0 && row3 < 5) {
						rowcol[2][column1] = num;
						row3++;
					} else if (rowcol[1][column1] == 0 && row2 < 5) {
						rowcol[1][column1] = num;
						row2++;
					}
					col1++;
					row++;
				}
			}
			if (num >= 11 && num <= 20) {

				int column2 = 1;
				if (col2 == 2) {
					System.out.println("Maximum Entry between 11 to 20");
				} else {
					if (rowcol[1][column2] == 0 && row2 < 5) {
						rowcol[1][column2] = num;
						row2++;
					} else if (rowcol[0][column2] == 0 && row1 < 5) {
						rowcol[0][column2] = num;
						row1++;
					}

					else if (rowcol[2][column2] == 0 && row3 < 5) {
						rowcol[2][column2] = num;
						row3++;
					}
					col2++;
					row++;
				}
			}
			if (num >= 21 && num <= 30) {

				int column3 = 2;
				if (col3 == 2) {
					System.out.println("Maximum Entry between 21 to 30");
				} else {
					if (rowcol[0][column3] == 0 && row1 < 5) {
						rowcol[0][column3] = num;
						row1++;
					} else if (rowcol[2][column3] == 0 && row3 < 5) {
						rowcol[2][column3] = num;
						row3++;
					} else if (rowcol[1][column3] == 0 && row2 < 5) {
						rowcol[1][column3] = num;
						row2++;
					}

					col3++;
					row++;
				}
			}
			if (num >= 31 && num <= 40) {

				int column4 = 3;
				if (col4 == 2) {
					System.out.println("Maximum Entry For between 31 to 40");
				} else {
					if (rowcol[1][column4] == 0 && row2 < 5) {
						rowcol[1][column4] = num;
						row2++;
					} else if (rowcol[0][column4] == 0 && row1 < 5) {
						rowcol[0][column4] = num;
						row1++;
					}

					else if (rowcol[2][column4] == 0 && row3 < 5) {
						rowcol[2][column4] = num;
						row3++;
					}

					col4++;
					row++;
				}
			}
			if (num >= 41 && num <= 50) {

				int column5 = 4;
				if (col5 == 2) {
					System.out.println("Maximum Entry between 41 to 50");
				} else {
					if (rowcol[0][column5] == 0 && row1 < 5) {
						rowcol[0][column5] = num;
						row1++;
					} else if (rowcol[2][column5] == 0 && row3 < 5) {
						rowcol[2][column5] = num;
						row3++;
					} else if (rowcol[1][column5] == 0 && row2 < 5) {
						rowcol[1][column5] = num;
						row2++;
					}

					col5++;
					row++;
				}
			}
			if (num >= 51 && num <= 60) {

				int column6 = 5;
				if (col6 == 2) {
					System.out.println("Maximum Entry between 51 to 60");
				} else {
					if (rowcol[2][column6] == 0 && row3 < 5) {
						rowcol[2][column6] = num;
						row3++;
					}

					else if (rowcol[1][column6] == 0 && row2 < 5) {
						rowcol[1][column6] = num;
						row2++;
					} else if (rowcol[0][column6] == 0 && row1 < 5) {
						rowcol[0][column6] = num;
						row1++;
					}

					col6++;
					row++;
				}
			}
			if (num >= 61 && num <= 70) {

				int column7 = 6;
				if (col7 == 2) {
					System.out.println("Maximum Entry between 61 to 70");
				} else {
					if (rowcol[0][column7] == 0 && row1 < 5) {
						rowcol[0][column7] = num;
						row1++;
					} else if (rowcol[2][column7] == 0 && row3 < 5) {
						rowcol[2][column7] = num;
						row3++;
					} else if (rowcol[1][column7] == 0 && row2 < 5) {
						rowcol[1][column7] = num;
						row2++;
					}

					col7++;
					row++;
				}
			}
			if (num >= 71 && num <= 80) {

				int column8 = 7;
				if (col8 == 2) {
					System.out.println("Maximum Entry between 71 to 80");
				} else {
					if (rowcol[1][column8] == 0 && row2 < 5) {
						rowcol[1][column8] = num;
						row2++;
					} else if (rowcol[0][column8] == 0 && row1 < 5) {
						rowcol[0][column8] = num;
						row1++;
					}

					else if (rowcol[2][column8] == 0 && row3 < 5) {
						rowcol[2][column8] = num;
						row3++;
					}
					col8++;
					row++;
				}
			}
			if (num >= 81 && num <= 90) {

				int column9 = 8;
				if (col9 == 2) {
					System.out.println("Maximum Entry between 81 to 90");
				} else {
					if (rowcol[0][column9] == 0 && row1 < 5) {
						rowcol[0][column9] = num;
						row1++;
					} else if (rowcol[1][column9] == 0 && row2 < 5) {
						rowcol[1][column9] = num;
						row2++;
					} else if (rowcol[2][column9] == 0 && row3 < 5) {
						rowcol[2][column9] = num;
						row3++;
					}
					col9++;
					row++;
				}
			}
		} catch (Exception e) {
			System.out.println("Something went wrong please restart" + e.getMessage());
		}

	}

	public static void main(String[] args) {

		int rowcol[][] = new int[3][9];
		HousieTicket ht = new HousieTicket();
		Scanner sc = new Scanner(System.in);
		try {
			while (row != 15) {
				System.out.println("Enter a Number between 1-90:");
				int input = sc.nextInt();
				if (input < 1 || input > 90) {
					System.out.println("Invalid Number! Please Enter a Number between 1-90");
				} else {
					if (!set.contains(input)) {
						set.add(input);
						ht.fillRowColumn(input, rowcol);
					} else {
						System.out.println("Duplicate Number!");
					}
				}
			}

			if (row == 15) {
				for (int i = 0; i < rowcol.length; i++) {
					for (int j = 0; j < rowcol[i].length; j++) {

						System.out.print(rowcol[i][j] + " ");
					}
					System.out.println();
				}
			}

		} catch (Exception e) {
			System.out.println("Something went wrong please restart" + e.getMessage());
		}
	}
}