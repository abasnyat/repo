
public class ArraySum {
	public int sumOfArray(Integer a[], int size) {
		if(size<=0)
			return 0;
		else
			return sumOfArray(a, size-1)+ a[size-1];
	}

}
