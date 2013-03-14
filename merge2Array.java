void Merg(int [] a1, int n1, int [] a2, int n2)
{
	assert(n1>0);
	assert(n2>0);
	assert(a1!=null);
	assert(a2!=null);
	int nIter1 = n1-1;
	int nIter2 = n2-1;
	int nIter = n1+n2-1;
	while (nIter1 >= 0 && nIter2 >= 0)
	{
		if (a1[nIter1] < a2[nIter2])
		{
			a2[nIter--] = a2[nIter2--];
		}
		else if (a1[nIter1] > a2[nIter2])
			{
				a2[nIter--] = a1[nIter1--];
			}
		else
			{
				a2[nIter--] = a1[nIter1--];
				a2[nIter--] = a1[nIter2--];
			}
	}

	if (nIter1 < 0)
	{
		while (nIter2 >= 0)
		{
			a2[nIter--] = a2[nIter2--];
		}
	}

	if (nIter2 < 0)
	{
		while (nIter1 >= 0)
		{
			a2[nIter--] = a2[nIter1--];
		}
	}
}
