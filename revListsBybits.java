public static void revListBybits (LinkedNode head, int len){
	int j = n-1;
	for (int i = 0; i < j; i++,j--)
	{
		a[i] = a[i]^a[j];
		a[j] = a[i]^a[j];
		a[i] = a[i]^a[j];
	}
}
