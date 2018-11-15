package comp.anupam;

public class Functions {

	public void sort(int numbers[], int flag) {
		 for ( int i = 0; i < 5; ++i) 
	        {
	 
	            for (int j = i + 1; j < 5; ++j)
	            { 
	            	if (flag == 1)
	            	{
					  if (numbers[i] > numbers[j]) 
		                {
		 
		                    int tmp =  numbers[i];
		                    numbers[i] = numbers[j];
		                    numbers[j] = tmp;
		 
		                }
				     }
	            	

				else if (flag == 0) 
				{
					if (numbers[i] < numbers[j]) 
	                {
	                    int tmp = numbers[i];
	                    numbers[i] = numbers[j];
	                    numbers[j] = tmp;
	                }
				}

			}
		}

		System.out.println("Numbers are");
		for (int i = 0; i < 5; i++) {
			System.out.println(numbers[i]);
		}

	}
	
	
	

	void sortAsce(int numbers[]) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i - 1; j++) {
				if (numbers[j] < numbers[j + 1]) {
					int tmp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = tmp;

				}
			}
		}

		System.out.println("Numbers are");
		for (int i = 0; i < 5; i++) {
			System.out.println(numbers[i]);
		}

	}

	void sortDesc(int numbers[]) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int tmp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = tmp;

				}
			}

		}

		System.out.println("Numbers are");
		for (int i = 0; i < 5; i++) {
			System.out.println(numbers[i]);
		}
	}

}
