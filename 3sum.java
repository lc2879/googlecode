// find triplet a , b ,c that a+b+c= k


// suppose the array is already sorted, otherwise we perform sorting on the array in O(lg n * n) time

set<vector<int> > find_triplets(vector<int> arr,int k) {
  sort(arr.begin(), arr.end());
  set<vector<int> > triplets;
  vector<int> triplet(3);
  int n = arr.size();
  for (int i = 0;i < n; i++) {
    int j = i + 1;
    int k = n - 1;
    while (j < k) {
      int sum_two = arr[i] + arr[j];
      if (sum_two + arr[k] < k-arr[i]) {
        j++;
      } else if (sum_two + arr[k] > k-arr[i]) {
        k--;
      } else {
        triplet[0] = arr[i];
        triplet[1] = arr[j];
        triplet[2] = arr[k];
        triplets.insert(triplet);
        j++;
        k--;
      }
     }
  }
  return triplets;
}


