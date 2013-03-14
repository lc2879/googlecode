#include <iostream>
#include <hash_map>
#include <string> 
 
using namespace std;
 
hash_map<char, string> buttonMap;
 
void print_internal(string digits, string prefix)
{
  if (digits.length() == 0){
    cout << prefix << endl;
    return;
  }
 
  string chars = buttonMap[digits[0]];
  string rest = digits.substr(1, digits.length() -1);
 
  for (int i = 0; i < chars.length(); i++){
    prefix.push_back(chars[i]);
    print_internal(rest, prefix);
    prefix.pop_back();    
  }
}
 
void print_all_combinations(string digits)
{
  buttonMap['2'] = "abc";
  buttonMap['3'] = "def";
  buttonMap['4'] = "ghi";
  buttonMap['5'] = "jkl";
  buttonMap['6'] = "mno";
  buttonMap['7'] = "pqrs";
  buttonMap['8'] = "tuv";
  buttonMap['9'] = "wxyz";
  print_internal(digits, "");
}
int main()
{
  print_all_combinations("9346489");
  return 0;
}
